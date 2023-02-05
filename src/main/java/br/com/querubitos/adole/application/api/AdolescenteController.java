package br.com.querubitos.adole.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class AdolescenteController implements AdolescenteAPI {

	@Override
	public AdolescenteResponse postAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteController - postAdolescente");
		log.info("[finaliza] AdolescenteController - postAdolescente");
		return null;
	}

}
