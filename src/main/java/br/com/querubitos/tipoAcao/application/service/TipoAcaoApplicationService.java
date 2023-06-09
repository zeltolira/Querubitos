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
	private final TipoAcaoRepository tipoAcaoRepository;
	
	@Override
	public TipoAcaoResponse criaTipoAcao(UUID idAdolescente, @Valid TipoAcaoRequest tipoAcaoRequest) {
		log.info("[inicia] TipoAcaoApplicationService - criaTipoAcao");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente tipoAcao = tipoAcaoRepository.salvaTipoAcao(new TipoPontuacaoDoAdolescente(idAdolescente, tipoAcaoRequest));
		log.info("[finaliza] TipoAcaoApplicationService - criaTipoAcao");
		return new TipoAcaoResponse(tipoAcao.getIdTipoPontuacao());
	}

	@Override
	public List<TipoAcaoListResponse> buscaTipoAcaoDoAdolescenteComID(UUID idAdolescente) {
		log.info("[inicia] TipoAcaoApplicationService - buscaTipoAcaoDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		List<TipoPontuacaoDoAdolescente> tipoAcaoDoAdolescente = tipoAcaoRepository.buscaTipoAcaoDoAdolescenteComID(idAdolescente); 
		log.info("[finaliza] TipoAcaoApplicationService - buscaTipoAcaoDoAdolescenteComID");
		return TipoAcaoListResponse.converte(tipoAcaoDoAdolescente);
	}

	@Override
	public TipoAcaoDoAdolescenteDetalhadoResponse buscaTipoAcaoDoAdolescenteComID(UUID idAdolescente,
			UUID idTipoAcao) {
		log.info("[inicia] TipoAcaoApplicationService - buscaQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente tipoAcao = tipoAcaoRepository.buscaTipoAcaoPeloId(idTipoAcao);
		log.info("[finaliza] TipoAcaoApplicationService - buscaQuerubitosDoAdolescenteComID");
		return new TipoAcaoDoAdolescenteDetalhadoResponse(tipoAcao);
	}

	@Override
	public void deletaTipoAcaoClienteComId(UUID idAdolescente, UUID idTipoAcao) {
		log.info("[inicia] TipoAcaoApplicationService - deletaQuerubitoClienteComId");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente tipoAcao = tipoAcaoRepository.buscaTipoAcaoPeloId(idTipoAcao);
		tipoAcaoRepository.deletaTipoAcao(tipoAcao);
		log.info("[finaliza] TipoAcaoApplicationService - deletaQuerubitoClienteComId");
		
	}

	@Override
	public void alteraTipoAcaoDoAdolescenteComID(UUID idAdolescente, UUID idTipoAcao,
			@Valid TipoAcaoAlteracaoRequest tipoAcaoAlteracaoRequest) {
		log.info("[inicia] TipoAcaoApplicationService - alteraQuerubitosDoAdolescenteComID");
		adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		TipoPontuacaoDoAdolescente tipoAcao = tipoAcaoRepository.buscaTipoAcaoPeloId(idTipoAcao);
		tipoAcao.altera(tipoAcaoAlteracaoRequest);
		tipoAcaoRepository.salvaTipoAcao(tipoAcao);
		log.info("[finaliza] TipoAcaoApplicationService - alteraQuerubitosDoAdolescenteComID");
		
	}

}
