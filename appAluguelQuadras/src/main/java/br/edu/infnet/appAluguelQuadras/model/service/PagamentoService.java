package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Pagamento;
import br.edu.infnet.appAluguelQuadras.model.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public void incluir(Pagamento pagamento)
    {
        pagamentoRepository.save(pagamento);
    }

    public Collection<Pagamento> obterLista()
    {
        return (Collection<Pagamento>) pagamentoRepository.findAll();
    }

    public void excluir (Integer id) {
        pagamentoRepository.deleteById(id);
    }
}
