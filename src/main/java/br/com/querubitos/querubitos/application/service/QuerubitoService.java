package br.com.querubitos.querubitos.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.querubitos.querubitos.application.api.QuerubitoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoResponse;

public interface QuerubitoService {
	QuerubitoResponse criaQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest);
}
