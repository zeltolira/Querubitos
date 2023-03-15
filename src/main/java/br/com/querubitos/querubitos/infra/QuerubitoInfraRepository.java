package br.com.querubitos.querubitos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.querubitos.querubitos.application.service.QuerubitoRepository;
import br.com.querubitos.querubitos.domain.Querubitos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class QuerubitoInfraRepository implements QuerubitoRepository {

	private final QuerubitoSpringDataJPARepository querubitoSpringDataJPARepository; 
	
	@Override
	public Querubitos salvaQuerubito(Querubitos querubito) {
		log.info("[inicia] QuerubitoInfraRepository - salvaQuerubito");
		querubitoSpringDataJPARepository.save(querubito);
		log.info("[finaliza] QuerubitoInfraRepository - salvaQuerubito");
		return querubito;
	}

	@Override
	public List<Querubitos> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente) {
		log.info("[inicia] QuerubitoInfraRepository - buscaQuerubitosDoAdolescenteComID");
		log.info("[finaliza] QuerubitoInfraRepository - buscaQuerubitosDoAdolescenteComID");
		return null;
	}

}
