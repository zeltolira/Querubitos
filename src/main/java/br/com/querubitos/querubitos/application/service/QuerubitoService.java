package br.com.querubitos.querubitos.application.service;

import java.util.UUID;

import br.com.querubitos.querubitos.application.api.QuerubitoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoResponse;
import jakarta.validation.Valid;

public interface QuerubitoService {
	QuerubitoResponse criaQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest);
}
