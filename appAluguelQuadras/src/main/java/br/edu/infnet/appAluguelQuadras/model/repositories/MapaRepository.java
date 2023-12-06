package br.edu.infnet.appAluguelQuadras.model.repositories;

import br.edu.infnet.appAluguelQuadras.model.domain.Mapa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapaRepository extends CrudRepository<Mapa, Integer> {
}
