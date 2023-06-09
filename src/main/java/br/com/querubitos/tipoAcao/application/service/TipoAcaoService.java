package br.com.querubitos.tipoAcao.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.querubitos.tipoAcao.application.api.TipoAcaoAlteracaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoDoAdolescenteDetalhadoResponse;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoListResponse;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoResponse;

public interface TipoAcaoService {
	TipoAcaoResponse criaTipoAcao(UUID idAdolescente, @Valid TipoAcaoRequest tipoAcaoRequest);
	List<TipoAcaoListResponse> buscaTipoAcaoDoAdolescenteComID(UUID idAdolescente);
	TipoAcaoDoAdolescenteDetalhadoResponse buscaTipoAcaoDoAdolescenteComID(UUID idAdolescente, UUID idTipoAcao);
	void deletaTipoAcaoClienteComId(UUID idAdolescente, UUID idTipoAcao);
	void alteraTipoAcaoDoAdolescenteComID(UUID idAdolescente, UUID idTipoAcao,
			@Valid TipoAcaoAlteracaoRequest tipoAcaoAlteracaoRequest);
}
