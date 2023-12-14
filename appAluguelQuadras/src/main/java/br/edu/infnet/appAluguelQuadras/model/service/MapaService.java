package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Agenda;
import br.edu.infnet.appAluguelQuadras.model.domain.Mapa;
import br.edu.infnet.appAluguelQuadras.model.repositories.AgendaRepository;
import br.edu.infnet.appAluguelQuadras.model.repositories.MapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MapaService {

    @Autowired
    private MapaRepository mapaRepository;

    public void incluir(Mapa mapa)
    {
        mapaRepository.save(mapa);
    }

    public Collection<Mapa> obterLista()
    {
        return (Collection<Mapa>) mapaRepository.findAll();
    }

    public void excluir (Integer id) {
        mapaRepository.deleteById(id);
    }
}
