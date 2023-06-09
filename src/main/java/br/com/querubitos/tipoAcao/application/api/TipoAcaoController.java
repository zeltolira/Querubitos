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

	private final TipoAcaoService tipoAcaoService;

	@Override
	public TipoAcaoResponse postTipoAcao(UUID idAdolescente, @Valid TipoAcaoRequest tipoAcaoRequest) {
		log.info("[inicia] TipoAcaoController - postTipoAcao");
		log.info("[idAdolescente] {}, idAdolescente");
		TipoAcaoResponse postTipoAcao = tipoAcaoService.criaTipoAcao(idAdolescente, tipoAcaoRequest);
		log.info("[finaliza] TipoAcaoController - postTipoAcao");
		return postTipoAcao;
	}

	@Override
	public List<TipoAcaoListResponse> getTipoAcaoDoAdolecente(UUID idAdolescente) {
		// TODO Auto-generated method stub
		log.info("[inicia] TipoAcaoController - getTipoAcaoDoAdolecente");
		log.info("[idAdolescente] {}, idAdolescente");
		List<TipoAcaoListResponse> tipoAcaoDoAdolescente = tipoAcaoService.buscaTipoAcaoDoAdolescenteComID(idAdolescente);
		log.info("[finaliza] TipoAcaoController - getTipoAcaoDoAdolecente");
		return tipoAcaoDoAdolescente;
	}

	@Override
	public TipoAcaoDoAdolescenteDetalhadoResponse getTipoAcaoDoAdolescenteAtravesId(UUID idAdolescente,
			UUID idTipoAcao) {
		log.info("[inicia] TipoAcaoController - getTipoAcaoDoAdolescenteAtravesId");
		log.info("[idAdolescente] {} - [idTipoAcao] {} - idAdolescente, idTipoAcao");
		TipoAcaoDoAdolescenteDetalhadoResponse tipoAcao = tipoAcaoService.buscaTipoAcaoDoAdolescenteComID(idAdolescente, idTipoAcao);
		log.info("[finaliza] TipoAcaoController - getTipoAcaoDoAdolescenteAtravesId");
		return tipoAcao;
	}

	@Override
	public void deletaTipoAcaoClienteComId(UUID idAdolescente, UUID idTipoAcao) {
			log.info("[inicia] TipoAcaoController - deletaTipoAcaoClienteComId");
			log.info("[idAdolescente] {} - [idTipoAcao] {} - idAdolescente, idTipoAcao");
			tipoAcaoService.deletaTipoAcaoClienteComId(idAdolescente, idTipoAcao);
			log.info("[finaliza] TipoAcaoController - deletaTipoAcaoClienteComId");		
	}

	@Override
	public void patchTipoAcao(UUID idAdolescente, UUID idTipoAcao,
			@Valid TipoAcaoAlteracaoRequest tipoAcaoAlteracaoRequest) {
		log.info("[inicia] TipoAcaoController - patchTipoAcao");
		log.info("[idAdolescente] {} - [idTipoAcao] {} - idAdolescente, idTipoAcao");
		tipoAcaoService.alteraTipoAcaoDoAdolescenteComID(idAdolescente, idTipoAcao, tipoAcaoAlteracaoRequest);
		log.info("[finaliza] TipoAcaoController - patchTipoAcao");		
	}

}
