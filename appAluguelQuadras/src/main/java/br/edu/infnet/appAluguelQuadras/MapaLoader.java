package br.edu.infnet.appAluguelQuadras;

import br.edu.infnet.appAluguelQuadras.model.domain.Mapa;
import br.edu.infnet.appAluguelQuadras.model.service.MapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(2)
@Component
public class MapaLoader implements ApplicationRunner{

    @Autowired
    private MapaService mapaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("appAluguelQuadras/files/mapas.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Mapa mapa = new Mapa();

            mapa.setCodigoQuadra(Integer.valueOf(campos[0]));
            mapa.setLatitude(Double.valueOf(campos[1]));
            mapa.setLongitude(Double.valueOf(campos[2]));
            mapa.setNome(campos[3]);
            mapa.setDescricao(campos[4]);

            mapaService.incluir(mapa);

            linha = leitura.readLine();
        }

        for(Mapa mapa : mapaService.obterLista()) {
            System.out.println("[MAPA] " + mapa);
        }

        leitura.close();
    }
}
