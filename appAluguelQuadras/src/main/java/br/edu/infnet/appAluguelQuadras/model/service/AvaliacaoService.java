package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Avaliacao;
import br.edu.infnet.appAluguelQuadras.model.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public void incluir(Avaliacao avaliacao)
    {
        avaliacaoRepository.save(avaliacao);
    }

    public Collection<Avaliacao> obterLista()
    {
        return (Collection<Avaliacao>) avaliacaoRepository.findAll();
    }

    public void excluir (Integer id) {
        avaliacaoRepository.deleteById(id);
    }
}
