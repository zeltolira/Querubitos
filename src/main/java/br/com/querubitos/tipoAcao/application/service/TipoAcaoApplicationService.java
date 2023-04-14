package br.com.querubitos.tipoAcao.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.querubitos.adole.application.service.AdolescenteService;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoAlteracaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoDoAdolescenteDetalhadoResponse;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoListResponse;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoResponse;
import br.com.querubitos.tipoAcao.application.repository.TipoAcaoRepository;
import br.com.querubitos.tipoAcao.domain.TipoPontuacaoDoAdolescente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class TipoAcaoApplicationService implements TipoAcaoService {
	private final AdolescenteService adolescenteService;
	private final TipoAcaoRepository querubitoRepository;
	
	@Override
	public TipoAcaoResponse criaQuerubito(UUID idAdolescente, @Valid TipoAcaoRequest querubitoRequest) {
		log.info("[inicia] QuerubitoApplicationService - criaQuerubito");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente querubito = querubitoRepository.salvaQuerubito(new TipoPontuacaoDoAdolescente(idAdolescente, querubitoRequest));
		log.info("[finaliza] QuerubitoApplicationService - criaQuerubito");
		return new TipoAcaoResponse(querubito.getIdTipoPontuacao());
	}

	@Override
	public List<TipoAcaoListResponse> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente) {
		log.info("[inicia] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		List<TipoPontuacaoDoAdolescente> querubitosDoAdolescente = querubitoRepository.buscaQuerubitosDoAdolescenteComID(idAdolescente); 
		log.info("[finaliza] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		return TipoAcaoListResponse.converte(querubitosDoAdolescente);
	}

	@Override
	public TipoAcaoDoAdolescenteDetalhadoResponse buscaQuerubitosDoAdolescenteComID(UUID idAdolescente,
			UUID idQuerubito) {
		log.info("[inicia] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente querubito = querubitoRepository.buscaQuerubitoPeloId(idQuerubito);
		log.info("[finaliza] QuerubitoApplicationService - buscaQuerubitosDoAdolescenteComID");
		return new TipoAcaoDoAdolescenteDetalhadoResponse(querubito);
	}

	@Override
	public void deletaQuerubitoClienteComId(UUID idAdolescente, UUID idQuerubito) {
		log.info("[inicia] QuerubitoApplicationService - deletaQuerubitoClienteComId");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente querubito = querubitoRepository.buscaQuerubitoPeloId(idQuerubito);
		querubitoRepository.deletaQuerubito(querubito);
		log.info("[finaliza] QuerubitoApplicationService - deletaQuerubitoClienteComId");
		
	}

	@Override
	public void alteraQuerubitosDoAdolescenteComID(UUID idAdolescente, UUID idQuerubito,
			@Valid TipoAcaoAlteracaoRequest querubitoAlteracaoRequest) {
		log.info("[inicia] QuerubitoApplicationService - alteraQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente querubito = querubitoRepository.buscaQuerubitoPeloId(idQuerubito);
		querubito.altera(querubitoAlteracaoRequest);
		querubitoRepository.salvaQuerubito(querubito);
		log.info("[finaliza] QuerubitoApplicationService - alteraQuerubitosDoAdolescenteComID");
		
	}

}
