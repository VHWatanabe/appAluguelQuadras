package br.edu.infnet.appAluguelQuadras.model.repositories;

import br.edu.infnet.appAluguelQuadras.model.domain.Solicitante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {
}
