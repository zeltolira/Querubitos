package br.com.querubitos.adole.application.service;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.adole.application.api.AdolescenteDetalhadoResponse;
import br.com.querubitos.adole.application.api.AdolescenteListResponse;
import br.com.querubitos.adole.application.api.AdolescenteRequest;
import br.com.querubitos.adole.application.api.AdolescenteResponse;

public interface AdolescenteService {
	AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest);
	List<AdolescenteListResponse> buscaTodosAdolescentes();
	AdolescenteDetalhadoResponse buscaAdolescenteAtravesId(UUID idAdolescente);
	void deletaAdolescenteAtravesId(UUID idAdolescente);
}