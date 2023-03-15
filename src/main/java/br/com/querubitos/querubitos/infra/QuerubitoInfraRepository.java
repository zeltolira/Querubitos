package br.com.querubitos.querubitos.infra;

import org.springframework.stereotype.Repository;

import br.com.querubitos.querubitos.application.service.QuerubitoRespository;
import br.com.querubitos.querubitos.domain.Querubitos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class QuerubitoInfraRepository implements QuerubitoRespository {

	private final QuerubitoSpringDataJPARepository querubitoSpringDataJPARepository; 
	
	@Override
	public Querubitos salvaQuerubito(Querubitos querubito) {
		log.info("[inicia] QuerubitoInfraRepository - salvaQuerubito");
		querubitoSpringDataJPARepository.save(querubito);
		log.info("[finaliza] QuerubitoInfraRepository - salvaQuerubito");
		return querubito;
	}

}
