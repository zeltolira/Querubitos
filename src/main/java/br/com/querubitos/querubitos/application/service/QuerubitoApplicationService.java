package br.com.querubitos.querubitos.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.querubitos.adole.application.service.AdolescenteService;
import br.com.querubitos.querubitos.application.api.QuerubitoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoResponse;
import br.com.querubitos.querubitos.domain.Querubitos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class QuerubitoApplicationService implements QuerubitoService {
	private final AdolescenteService adolescenteService;
	private final QuerubitoRespository querubitoRepository;
	
	@Override
	public QuerubitoResponse criaQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoApplicationService - criaQuerubito");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		Querubitos querubito = querubitoRepository.salvaQuerubito(new Querubitos(idAdolescente, querubitoRequest));
		log.info("[finaliza] QuerubitoApplicationService - criaQuerubito");
		return new QuerubitoResponse(querubito.getIdQuerubito());
	}

}
