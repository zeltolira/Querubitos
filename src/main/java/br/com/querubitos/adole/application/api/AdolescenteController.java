package br.com.querubitos.adole.application.api;

import java.util.List;
import java.util.UUID;

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
		List<AdolescenteListResponse> adolescentes = adolescenteService.buscaTodosAdolescentes(); 
		log.info("[finaliza] AdolescenteController - getTodosAdolescentes");
		return adolescentes;
	}

	@Override
	public AdolescenteDetalhadoResponse getAdolescentesAtravesId(UUID idAdolescente) {
		log.info("[inicia] AdolescenteController - getAdolescenteAtravesId");
		log.info("[idAdolescente] {}", idAdolescente);
		AdolescenteDetalhadoResponse adolescenteDetalhado = adolescenteService.buscaAdolescenteAtravesId(idAdolescente);
		log.info("[finaliza] AdolescenteController - getAdolescenteAtravesId");
		return adolescenteDetalhado;
	}

	@Override
	public void deletaAdolescenteAtravesId(UUID idAdolescente) {
		log.info("[inicia] AdolescenteController - deletaAdolescenteAtravesId");
		log.info("[idAdolescente] {}", idAdolescente);
		adolescenteService.deletaAdolescenteAtravesId(idAdolescente);
		log.info("[finaliza] AdolescenteController - deletaAdolescenteAtravesId");
	
	}
}