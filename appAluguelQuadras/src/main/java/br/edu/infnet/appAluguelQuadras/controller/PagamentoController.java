package br.edu.infnet.appAluguelQuadras.controller;

import br.edu.infnet.appAluguelQuadras.model.domain.Pagamento;
import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.service.PagamentoService;
import br.edu.infnet.appAluguelQuadras.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping (value = "/listar")
    public List<Pagamento> obterLista() {
        return (List<Pagamento>) pagamentoService.obterLista();
    }

    @PostMapping (value = "/incluir")
    public void incluir (@RequestBody Pagamento pagamento) {
        pagamentoService.incluir(pagamento);
    }

    @DeleteMapping (value = "/{id}/excluir")
    public void excluir (@PathVariable Integer id) {
        pagamentoService.excluir(id);
    }

}
