package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Endereco;
import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import br.edu.infnet.appAluguelQuadras.model.repositories.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;
    @Autowired
    private EnderecoService enderecoService;

    public void incluir(Solicitante solicitante)
    {
        String cep = solicitante.getEndereco().getCep();

        Endereco endereco = enderecoService.buscarCep(cep);

        solicitante.setEndereco(endereco);

        solicitanteRepository.save(solicitante);
    }

    public Collection<Solicitante> obterLista()
    {
        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }

    public void excluir (Integer id) {
        solicitanteRepository.deleteById(id);
    }
}
