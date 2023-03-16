package br.com.querubitos.querubitos.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.querubitos.querubitos.application.api.QuerubitoDoAdolescenteDetalhadoResponse;
import br.com.querubitos.querubitos.application.api.QuerubitoListResponse;
import br.com.querubitos.querubitos.application.api.QuerubitoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoResponse;

public interface QuerubitoService {
	QuerubitoResponse criaQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest);
	List<QuerubitoListResponse> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente);
	QuerubitoDoAdolescenteDetalhadoResponse buscaQuerubitosDoAdolescenteComID(UUID idAdolescente, UUID idQuerubito);
}
