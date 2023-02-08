package br.com.querubitos.adole.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.querubitos.adole.application.api.AdolescenteDetalhadoResponse;
import br.com.querubitos.adole.application.api.AdolescenteListResponse;
import br.com.querubitos.adole.application.api.AdolescenteRequest;
import br.com.querubitos.adole.application.api.AdolescenteResponse;
import br.com.querubitos.adole.application.repository.AdolescenteRepository;
import br.com.querubitos.adole.domain.Adolescente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class AdolescenteApplicationService implements AdolescenteService {

	private final AdolescenteRepository adolescenteRepository;

	@Override
	public AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteApplicationService - criaAdolescente");
		Adolescente adolescente = adolescenteRepository.salva(new Adolescente(adolescenteRequest));
		log.info("[finaliza] AdolescenteApplicationService - criaAdolescente");
		return AdolescenteResponse.builder()
				.idAdolescente(adolescente.getIdAdolescente())
				.build();
	}

	@Override
	public List<AdolescenteListResponse> buscaTodosAdolescentes() {
		log.info("[inicia] AdolescenteApplicationService - buscaTodosAdolescentes");
		List<Adolescente> adolescentes = adolescenteRepository.buscaTodosAdolescentes();
		log.info("[finaliza] AdolescenteApplicationService - buscaTodosAdolescentes");
		return AdolescenteListResponse.converte(adolescentes);
	}

	@Override
	public AdolescenteDetalhadoResponse buscaAdolescenteAtravesId(UUID idAdolescente) {
		log.info("[inicia] AdolescenteApplicationService - buscaAdolescenteAtravesId");
		log.info("[finailiza] AdolescenteApplicationService - buscaAdolescenteAtravesId");
		return null;
	}
}