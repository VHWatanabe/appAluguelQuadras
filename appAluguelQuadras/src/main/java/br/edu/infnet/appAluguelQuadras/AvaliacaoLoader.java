package br.edu.infnet.appAluguelQuadras;

import br.edu.infnet.appAluguelQuadras.model.domain.Avaliacao;
import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(6)
@Component
public class AvaliacaoLoader implements ApplicationRunner {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("appAluguelQuadras/files/avaliacoes.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Avaliacao avaliacao = new Avaliacao();

            avaliacao.setNota(Float.parseFloat(campos[0]));
            avaliacao.setSolicitante(new Solicitante(Integer.valueOf(campos[1])));
            avaliacao.setCodigoAvaliacao(Integer.parseInt(campos[2]));

            avaliacaoService.incluir(avaliacao);

            linha = leitura.readLine();
        }

        for(Avaliacao avaliacao : avaliacaoService.obterLista()) {
            System.out.println("[AVALIAÇÃO] " + avaliacao);
        }

        leitura.close();
    }
}
