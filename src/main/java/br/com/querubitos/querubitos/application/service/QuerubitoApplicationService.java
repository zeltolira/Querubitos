package br.com.querubitos.querubitos.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.querubitos.adole.application.service.AdolescenteService;
import br.com.querubitos.querubitos.application.api.QuerubitoAlteracaoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoDoAdolescenteDetalhadoResponse;
import br.com.querubitos.querubitos.application.api.QuerubitoListResponse;
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
	private final QuerubitoRepository querubitoRepository;
	
	@Override
	public QuerubitoResponse criaQuerubito(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoApplicationService - criaQuerubito");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		Querubitos querubito = querubitoRepository.salvaQuerubito(new Querubitos(idAdolescente, querubitoRequest));
		log.info("[finaliza] QuerubitoApplicationService - criaQuerubito");
		return new QuerubitoResponse(querubito.getIdQuerubito());
	}

	@Override
	public List<QuerubitoListResponse> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente) {
		log.info("[inicia] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		List<Querubitos> querubitosDoAdolescente = querubitoRepository.buscaQuerubitosDoAdolescenteComID(idAdolescente); 
		log.info("[finaliza] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		return QuerubitoListResponse.converte(querubitosDoAdolescente);
	}

	@Override
	public QuerubitoDoAdolescenteDetalhadoResponse buscaQuerubitosDoAdolescenteComID(UUID idAdolescente,
			UUID idQuerubito) {
		log.info("[inicia] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		Querubitos querubito = querubitoRepository.buscaQuerubitoPeloId(idQuerubito);
		log.info("[finaliza] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		return new QuerubitoDoAdolescenteDetalhadoResponse(querubito);
	}

	@Override
	public void deletaQuerubitoClienteComId(UUID idAdolescente, UUID idQuerubito) {
		log.info("[inicia] QuerubitoApplicationService - deletaQuerubitoClienteComId");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		Querubitos querubito = querubitoRepository.buscaQuerubitoPeloId(idQuerubito);
		querubitoRepository.deletaQuerubito(querubito);
		log.info("[finaliza] QuerubitoApplicationService - deletaQuerubitoClienteComId");
		
	}

	@Override
	public void alteraQuerubitosDoAdolescenteComID(UUID idAdolescente, UUID idQuerubito,
			@Valid QuerubitoAlteracaoRequest querubitoAlteracaoRequest) {
		log.info("[inicia] QuerubitoApplicationService - alteraQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		Querubitos querubito = querubitoRepository.buscaQuerubitoPeloId(idQuerubito);
		querubito.altera(querubitoAlteracaoRequest);
		querubitoRepository.salvaQuerubito(querubito);
		log.info("[finaliza] QuerubitoApplicationService - alteraQuerubitosDoAdolescenteComID");
		
	}

}
