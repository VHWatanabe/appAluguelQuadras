package br.edu.infnet.appAluguelQuadras.controller;

import br.edu.infnet.appAluguelQuadras.model.domain.Avaliacao;
import br.edu.infnet.appAluguelQuadras.model.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping (value = "/listar")
    public List<Avaliacao> obterLista() {
        return (List<Avaliacao>) avaliacaoService.obterLista();
    }

    @PostMapping (value = "/incluir")
    public void incluir (@RequestBody Avaliacao avaliacao) {
        avaliacaoService.incluir(avaliacao);
    }

    @DeleteMapping (value = "/{id}/excluir")
    public void excluir (@PathVariable Integer id) {
        avaliacaoService.excluir(id);
    }

}
