package br.com.querubitos.querubitos.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.querubitos.querubitos.application.service.QuerubitoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class QuerubitoController implements QuerubitoAPI {

	private final QuerubitoService querubitoService;

	@Override
	public QuerubitoResponse postQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoController - postQuerubito");
		log.info("[idAdolescente] {}, idAdolescente");
		QuerubitoResponse querubito = querubitoService.criaQuerubito(idAdolescente, querubitoRequest);
		log.info("[finaliza] QuerubitoController - postQuerubito");
		return querubito;
	}

}
