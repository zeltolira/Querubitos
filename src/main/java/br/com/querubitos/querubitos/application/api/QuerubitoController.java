package br.com.querubitos.querubitos.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class QuerubitoController implements QuerubitoAPI {

	@Override
	public QuerubitoResponse postQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoController - postQuerubito");
		log.info("[idAdolescente] {}, idAdolescente");
		log.info("[finaliza] QuerubitoController - postQuerubito");
		return null;
	}

}
