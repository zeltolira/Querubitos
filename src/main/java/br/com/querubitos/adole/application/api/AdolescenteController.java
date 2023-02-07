package br.com.querubitos.adole.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.querubitos.adole.application.service.AdolescenteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AdolescenteController implements AdolescenteAPI {

	private final AdolescenteService adolescenteService;

	@Override
	public AdolescenteResponse postAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteController - postAdolescente");
		AdolescenteResponse adolescenteCriado = adolescenteService.criaAdolescente(adolescenteRequest);
		log.info("[finaliza] AdolescenteController - postAdolescente");
		return adolescenteCriado;
	}

	@Override
	public List<AdolescenteListResponse> getTodosAdolescentes() {
		log.info("[inicia] AdolescenteController - getTodosAdolescentes");
		log.info("[finaliza] AdolescenteController - getTodosAdolescentes");
		return null;
	}

}
