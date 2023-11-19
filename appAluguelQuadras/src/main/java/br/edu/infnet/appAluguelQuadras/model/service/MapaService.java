package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Mapa;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MapaService {

    private Map<Integer, Mapa> map = new HashMap<Integer, Mapa>();

    public void incluir(Mapa mapa) {
        map.put(mapa.getCodigoQuadra(), mapa);
    };

    public Collection<Mapa> obterLista() {
        return map.values();
    };
}
