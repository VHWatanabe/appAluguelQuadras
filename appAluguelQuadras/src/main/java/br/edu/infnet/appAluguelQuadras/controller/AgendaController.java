package br.edu.infnet.appAluguelQuadras.controller;

import br.edu.infnet.appAluguelQuadras.model.domain.Agenda;
import br.edu.infnet.appAluguelQuadras.model.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping (value = "/listar")
    public List<Agenda> obterLista() {
        return (List<Agenda>) agendaService.obterLista();
    }

    @PostMapping (value = "/incluir")
    public void incluir (@RequestBody Agenda agenda) {
        agendaService.incluir(agenda);
    }

    @DeleteMapping (value = "/{id}/excluir")
    public void excluir (@PathVariable Integer id) {
        agendaService.excluir(id);
    }

}
