package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Lobby;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LobbyService {
    private Map<Integer, Lobby> map = new HashMap<Integer, Lobby>();

    public void incluir(Lobby lobby) {
        map.put(lobby.getCodigoLobby(), lobby);
    };

    public Collection<Lobby> obterLista() {
        return map.values();
    };
}
