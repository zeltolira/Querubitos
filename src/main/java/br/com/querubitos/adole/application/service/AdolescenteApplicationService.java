package br.com.querubitos.adole.application.service;

import org.springframework.stereotype.Service;

import br.com.querubitos.adole.application.api.AdolescenteRequest;
import br.com.querubitos.adole.application.api.AdolescenteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AdolescenteApplicationService implements AdolescenteService {

	@Override
	public AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteApplicationService - criaAdolescente");
		log.info("[finaliza] AdolescenteApplicationService - criaAdolescente");
		return null;
	}

}
