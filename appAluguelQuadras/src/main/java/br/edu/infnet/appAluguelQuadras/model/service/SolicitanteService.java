package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.repositories.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public void incluir(Solicitante solicitante)
    {
        solicitanteRepository.save(solicitante);
    }

    public Collection<Solicitante> obterLista()
    {
        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }
}
