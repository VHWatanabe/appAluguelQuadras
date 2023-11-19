package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SolicitanteService {

    private Map<String, Solicitante> map = new HashMap<String, Solicitante>();

    public void incluir(Solicitante solicitante) {
        map.put(solicitante.getCpf(), solicitante);
    };

    public Collection<Solicitante> obterLista() {
        return map.values();
    };
}
