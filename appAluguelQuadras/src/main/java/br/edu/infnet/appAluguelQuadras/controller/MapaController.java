package br.edu.infnet.appAluguelQuadras.controller;

import br.edu.infnet.appAluguelQuadras.model.domain.Mapa;
import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.service.MapaService;
import br.edu.infnet.appAluguelQuadras.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/mapa")
public class MapaController {

    @Autowired
    private MapaService mapaService;

    @GetMapping (value = "/listar")
    public List<Mapa> obterLista() {
        return (List<Mapa>) mapaService.obterLista();
    }

    @PostMapping (value = "/incluir")
    public void incluir (@RequestBody Mapa mapa) {
        mapaService.incluir(mapa);
    }

    @DeleteMapping (value = "/{id}/excluir")
    public void excluir (@PathVariable Integer id) {
        mapaService.excluir(id);
    }

}
