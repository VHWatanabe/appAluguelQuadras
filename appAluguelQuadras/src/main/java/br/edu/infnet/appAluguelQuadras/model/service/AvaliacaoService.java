package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Avaliacao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AvaliacaoService {
    private Map<Integer, Avaliacao> map = new HashMap<Integer, Avaliacao>();

    public void incluir(Avaliacao avaliacao) {
        map.put(avaliacao.getCodigoAvaliacao(), avaliacao);
    };

    public Collection<Avaliacao> obterLista() {
        return map.values();
    };
}
