package br.edu.infnet.appAluguelQuadras.model.repositories;

import br.edu.infnet.appAluguelQuadras.model.domain.Agenda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends CrudRepository<Agenda, Integer> {
}
