package br.edu.infnet.appAluguelQuadras;

import br.edu.infnet.appAluguelQuadras.model.domain.Lobby;
import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.service.LobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

@Order(5)
@Component
public class LobbyLoader implements ApplicationRunner {

    @Autowired
    private LobbyService lobbyService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("appAluguelQuadras/files/lobbies.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        Lobby lobby = null;

        while (linha != null) {
            campos = linha.split(";");

            switch (campos[0]) {
                case "L":
                    lobby = new Lobby();

                    lobby.setTipoEsporte(campos[1]);
                    lobby.setQtdJogadores(Integer.parseInt(campos[2]));
                    lobby.setCodigoLobby(Integer.parseInt(campos[3]));
                    lobby.setListaJogadores(new ArrayList<Solicitante>());

                    break;

                case "S":
                    Solicitante solicitante = new Solicitante();
                    solicitante.setId(Integer.valueOf(campos[1]));

                    lobby.getListaJogadores().add(solicitante);

                    break;

                default:
                    break;
            }

            linha = leitura.readLine();
        }

        lobbyService.incluir(lobby);

        for(Lobby l : lobbyService.obterLista()) {
            System.out.println("[LOBBY] " + l);
        }

        leitura.close();
    }
}
