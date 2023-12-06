package br.edu.infnet.appAluguelQuadras.model.repositories;

import br.edu.infnet.appAluguelQuadras.model.domain.Avaliacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends CrudRepository<Avaliacao, Integer> {
}
