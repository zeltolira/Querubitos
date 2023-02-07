package br.com.querubitos.adole.application.infra;

import org.springframework.stereotype.Repository;

import br.com.querubitos.adole.application.repository.AdolescenteRepository;
import br.com.querubitos.adole.domain.Adolescente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class AdolescenteInfraRepositoty implements AdolescenteRepository {

	@Override
	public Adolescente salva(Adolescente adolescente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		log.info("[finaliza] ClienteInfraRepository - salva");
		return adolescente;
	}

}
