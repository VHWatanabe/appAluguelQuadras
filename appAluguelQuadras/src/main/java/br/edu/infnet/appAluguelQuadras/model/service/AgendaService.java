package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Agenda;
import br.edu.infnet.appAluguelQuadras.model.repositories.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public void incluir(Agenda agenda)
    {
        agendaRepository.save(agenda);
    }

    public Collection<Agenda> obterLista()
    {
        return (Collection<Agenda>) agendaRepository.findAll();
    }

    public void excluir (Integer id) {
        agendaRepository.deleteById(id);
    }
}
