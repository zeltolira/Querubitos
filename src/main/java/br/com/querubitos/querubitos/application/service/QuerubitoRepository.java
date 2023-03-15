package br.com.querubitos.querubitos.application.service;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.querubitos.domain.Querubitos;

public interface QuerubitoRepository {
	Querubitos salvaQuerubito(Querubitos querubito);
	List<Querubitos> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente);
}
