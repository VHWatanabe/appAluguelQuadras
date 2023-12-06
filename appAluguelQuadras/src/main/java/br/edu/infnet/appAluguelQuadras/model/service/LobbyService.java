package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Lobby;
import br.edu.infnet.appAluguelQuadras.model.repositories.LobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LobbyService {

    @Autowired
    private LobbyRepository lobbyRepository;

    public void incluir(Lobby lobby)
    {
        lobbyRepository.save(lobby);
    }

    public Collection<Lobby> obterLista()
    {
        return (Collection<Lobby>) lobbyRepository.findAll();
    }
}
