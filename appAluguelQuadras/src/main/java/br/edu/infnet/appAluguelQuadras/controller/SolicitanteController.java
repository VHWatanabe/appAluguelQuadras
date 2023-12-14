package br.edu.infnet.appAluguelQuadras.controller;

import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/solicitante")
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping (value = "/listar")
    public List<Solicitante> obterLista() {
        return (List<Solicitante>) solicitanteService.obterLista();
    }

    @PostMapping (value = "/incluir")
    public void incluir (@RequestBody Solicitante solicitante) {
        solicitanteService.incluir(solicitante);
    }

    @DeleteMapping (value = "/{id}/excluir")
    public void excluir (@PathVariable Integer id) {
        solicitanteService.excluir(id);
    }

}
