package br.com.querubitos.tipoAcao.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.querubitos.tipoAcao.application.service.TipoAcaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class TipoAcaoController implements TipoAcaoAPI {

	private final TipoAcaoService querubitoService;

	@Override
	public TipoAcaoResponse postQuerubito(UUID idAdolescente, @Valid TipoAcaoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoController - postQuerubito");
		log.info("[idAdolescente] {}, idAdolescente");
		TipoAcaoResponse querubito = querubitoService.criaQuerubito(idAdolescente, querubitoRequest);
		log.info("[finaliza] QuerubitoController - postQuerubito");
		return querubito;
	}

	@Override
	public List<TipoAcaoListResponse> getQuerubitosDoAdolecente(UUID idAdolescente) {
		// TODO Auto-generated method stub
		log.info("[inicia] QuerubitoController - getQuerubitosDoAdolecente");
		log.info("[idAdolescente] {}, idAdolescente");
		List<TipoAcaoListResponse> querubitosDoAdolescente = querubitoService.buscaQuerubitosDoAdolescenteComID(idAdolescente);
		log.info("[finaliza] QuerubitoController - getQuerubitosDoAdolecente");
		return querubitosDoAdolescente;
	}

	@Override
	public TipoAcaoDoAdolescenteDetalhadoResponse getQuerubitoDoAdolescenteAtravesId(UUID idAdolescente,
			UUID idQuerubito) {
		log.info("[inicia] QuerubitoController - getQuerubitoDoAdolescenteAtravesId");
		log.info("[idAdolescente] {} - [idQuerubito] {} - idAdolescente, idQuerubito");
		TipoAcaoDoAdolescenteDetalhadoResponse querubito = querubitoService.buscaQuerubitosDoAdolescenteComID(idAdolescente, idQuerubito);
		log.info("[finaliza] QuerubitoController - getQuerubitoDoAdolescenteAtravesId");
		return querubito;
	}

	@Override
	public void deletaQuerubitoClienteComId(UUID idAdolescente, UUID idQuerubito) {
			log.info("[inicia] QuerubitoController - deletaQuerubitoClienteAtravesId");
			log.info("[idAdolescente] {} - [idQuerubito] {} - idAdolescente, idQuerubito");
			querubitoService.deletaQuerubitoClienteComId(idAdolescente, idQuerubito);
			log.info("[finaliza] QuerubitoController - deletaQuerubitoClienteAtravesId");		
	}

	@Override
	public void patchQuerubito(UUID idAdolescente, UUID idQuerubito,
			@Valid TipoAcaoAlteracaoRequest querubitoAlteracaoRequest) {
		log.info("[inicia] QuerubitoController - patchQuerubito");
		log.info("[idAdolescente] {} - [idQuerubito] {} - idAdolescente, idQuerubito");
		querubitoService.alteraQuerubitosDoAdolescenteComID(idAdolescente, idQuerubito, querubitoAlteracaoRequest);
		log.info("[finaliza] QuerubitoController - patchQuerubito");		
	}

}
