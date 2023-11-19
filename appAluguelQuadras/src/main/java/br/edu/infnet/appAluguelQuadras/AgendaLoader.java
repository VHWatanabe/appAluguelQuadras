package br.edu.infnet.appAluguelQuadras;

import br.edu.infnet.appAluguelQuadras.model.domain.Agenda;
import br.edu.infnet.appAluguelQuadras.model.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;

@Order(3)
@Component
public class AgendaLoader implements ApplicationRunner {

    @Autowired
    private AgendaService agendaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("appAluguelQuadras/files/agendas.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Agenda agenda = new Agenda();

            agenda.setHorario(LocalTime.parse(campos[0]));
            agenda.setData(LocalDate.parse(campos[1]));
            agenda.setNomeQuadra(campos[2]);
            agenda.setValor(Float.parseFloat(campos[3]));

            agendaService.incluir(agenda);

            linha = leitura.readLine();
        }

        for(Agenda agenda : agendaService.obterLista()) {
            System.out.println("[AGENDA] " + agenda);
        }

        leitura.close();
    }
}
