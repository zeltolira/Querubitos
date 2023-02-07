package br.com.querubitos.adole.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.querubitos.adole.application.repository.AdolescenteRepository;
import br.com.querubitos.adole.domain.Adolescente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AdolescenteInfraRepositoty implements AdolescenteRepository {

	private final AdolescenteSpringDataJPARepository adolescenteSpringDataJPARepository;

	@Override
	public Adolescente salva(Adolescente adolescente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		adolescenteSpringDataJPARepository.save(adolescente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return adolescente;
	}

	@Override
	public List<Adolescente> buscaTodosAdolescentes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosAdolescentes");
		log.info("[finaliza] ClienteInfraRepository - buscaTodosAdolescentes");
		return null;
	}
}