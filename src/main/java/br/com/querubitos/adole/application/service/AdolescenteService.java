package br.com.querubitos.adole.application.service;

import br.com.querubitos.adole.application.api.AdolescenteRequest;
import br.com.querubitos.adole.application.api.AdolescenteResponse;

public interface AdolescenteService {
	AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest);
}