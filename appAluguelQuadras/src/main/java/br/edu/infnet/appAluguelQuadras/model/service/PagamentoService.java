package br.edu.infnet.appAluguelQuadras.model.service;

import br.edu.infnet.appAluguelQuadras.model.domain.Pagamento;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {
    private Map<Integer, Pagamento> map = new HashMap<Integer, Pagamento>();

    public void incluir(Pagamento pagamento) {
        map.put(pagamento.getCodigoPagamento(), pagamento);
    };

    public Collection<Pagamento> obterLista() {
        return map.values();
    };
}
