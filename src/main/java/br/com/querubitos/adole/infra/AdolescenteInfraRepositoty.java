package br.com.querubitos.adole.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.querubitos.adole.application.repository.AdolescenteRepository;
import br.com.querubitos.adole.domain.Adolescente;
import br.com.querubitos.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AdolescenteInfraRepositoty implements AdolescenteRepository {

	private final AdolescenteSpringDataJPARepository adolescenteSpringDataJPARepository;

	@Override
	public Adolescente salva(Adolescente adolescente) {
		log.info("[inicia] AdolescenteInfraRepositoty - salva");
		adolescenteSpringDataJPARepository.save(adolescente);
		log.info("[finaliza] AdolescenteInfraRepositoty - salva");
		return adolescente;
	}

	@Override
	public List<Adolescente> buscaTodosAdolescentes() {
		log.info("[inicia] AdolescenteInfraRepositoty - buscaTodosAdolescentes");
		List<Adolescente> todosAdolescentes = adolescenteSpringDataJPARepository.findAll();
		log.info("[finaliza] AdolescenteInfraRepositoty - buscaTodosAdolescentes");
		return todosAdolescentes;
	}

	@Override
	public Adolescente buscaAdolescenteAtrvesId(UUID idAdolescente) {
		log.info("[inicia] AdolescenteInfraRepositoty - buscaAdolescenteAtrvesId");
		Adolescente adolescente = adolescenteSpringDataJPARepository.findById(idAdolescente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Adolescente não encontrado!"));
		log.info("[finaliza] AdolescenteInfraRepositoty - buscaAdolescenteAtrvesId");
		return adolescente;
	}

	@Override
	public void deletaAdolescente(Adolescente adolescente) {
		log.info("[inicia] AdolescenteInfraRepositoty - deletaAdolescente");
		adolescenteSpringDataJPARepository.delete(adolescente);
		log.info("[finaliza] AdolescenteInfraRepositoty - deletaAdolescente");
	}
}