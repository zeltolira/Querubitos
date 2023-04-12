package br.com.querubitos.adole.application.service;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.adole.application.api.request.AdolescenteAlteracaoRequest;
import br.com.querubitos.adole.application.api.request.AdolescenteRequest;
import br.com.querubitos.adole.application.api.response.AdolescenteDetalhadoResponse;
import br.com.querubitos.adole.application.api.response.AdolescenteListResponse;
import br.com.querubitos.adole.application.api.response.AdolescenteResponse;

public interface AdolescenteService {
	AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest);
	List<AdolescenteListResponse> buscaTodosAdolescentes();
	AdolescenteDetalhadoResponse buscaAdolescenteAtravesId(UUID idAdolescente);
	void deletaAdolescenteAtravesId(UUID idAdolescente);
	void patchAlteraAdolescente(UUID idAdolescente, AdolescenteAlteracaoRequest adolescenteAlteracaoRequest);
}