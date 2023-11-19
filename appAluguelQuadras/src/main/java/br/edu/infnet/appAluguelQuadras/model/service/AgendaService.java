package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Agenda;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AgendaService {
    private Map<String, Agenda> map = new HashMap<String, Agenda>();

    public void incluir(Agenda agenda) {
        map.put(agenda.getNomeQuadra(), agenda);
    };

    public Collection<Agenda> obterLista() {
        return map.values();
    };
}
