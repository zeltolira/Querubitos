package br.com.querubitos.querubitos.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.querubitos.querubitos.application.api.QuerubitoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class QuerubitoApplicationService implements QuerubitoService {

	@Override
	public QuerubitoResponse criaQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoApplicationService - criaQuerubito");
		log.info("[finaliza] QuerubitoApplicationService - criaQuerubito");
		return null;
	}

}
