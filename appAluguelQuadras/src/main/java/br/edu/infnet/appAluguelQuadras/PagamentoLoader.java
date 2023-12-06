package br.edu.infnet.appAluguelQuadras;

import br.edu.infnet.appAluguelQuadras.model.domain.Pagamento;
import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;

@Order(4)
@Component
public class PagamentoLoader implements ApplicationRunner {

    @Autowired
    private PagamentoService pagamentoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("appAluguelQuadras/files/pagamentos.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Pagamento pagamento = new Pagamento();

            pagamento.setSolicitante(new Solicitante(Integer.valueOf(campos[0])));
            pagamento.setNumCartao(campos[1]);
            pagamento.setVencimento(LocalDate.parse(campos[2]));
            pagamento.setCvv(Integer.parseInt(campos[3]));
            pagamento.setStatus(Boolean.parseBoolean(campos[4]));
            pagamento.setCodigoPagamento(Integer.parseInt(campos[5]));

            pagamentoService.incluir(pagamento);

            linha = leitura.readLine();
        }

        for(Pagamento pagamento : pagamentoService.obterLista()) {
            System.out.println("[PAGAMENTO] " + pagamento);
        }

        leitura.close();
    }
}
