package br.edu.infnet.appAluguelQuadras.model.repositories;

import br.edu.infnet.appAluguelQuadras.model.domain.Pagamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends CrudRepository<Pagamento, Integer> {
}
