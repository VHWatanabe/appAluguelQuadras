package br.edu.infnet.appAluguelQuadras.controller;

import br.edu.infnet.appAluguelQuadras.model.domain.Lobby;
import br.edu.infnet.appAluguelQuadras.model.service.LobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/lobby")
public class LobbyController {

    @Autowired
    private LobbyService lobbyService;

    @GetMapping (value = "/listar")
    public List<Lobby> obterLista() {
        return (List<Lobby>) lobbyService.obterLista();
    }

    @PostMapping (value = "/incluir")
    public void incluir (@RequestBody Lobby lobby) {
        lobbyService.incluir(lobby);
    }

    @DeleteMapping (value = "/{id}/excluir")
    public void excluir (@PathVariable Integer id) {
        lobbyService.excluir(id);
    }

}
