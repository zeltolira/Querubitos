package br.com.querubitos.querubitos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.querubitos.handler.APIException;
import br.com.querubitos.querubitos.application.repository.TipoAcaoRepository;
import br.com.querubitos.querubitos.domain.TipoPontuacaoDoAdolescente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class TipoAcaoInfraRepository implements TipoAcaoRepository {

	private final TipoAcaoSpringDataJPARepository querubitoSpringDataJPARepository; 
	
	@Override
	public TipoPontuacaoDoAdolescente salvaQuerubito(TipoPontuacaoDoAdolescente querubito) {
		log.info("[inicia] QuerubitoInfraRepository - salvaQuerubito");
		querubitoSpringDataJPARepository.save(querubito);
		log.info("[finaliza] QuerubitoInfraRepository - salvaQuerubito");
		return querubito;
	}

	@Override
	public List<TipoPontuacaoDoAdolescente> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente) {
		log.info("[inicia] QuerubitoInfraRepository - buscaQuerubitosDoAdolescenteComID");
		var querubitos = querubitoSpringDataJPARepository.findByIdAdolescenteRecebedor(idAdolescente);
		log.info("[finaliza] QuerubitoInfraRepository - buscaQuerubitosDoAdolescenteComID");
		return querubitos;
	}

	@Override
	public TipoPontuacaoDoAdolescente buscaQuerubitoPeloId(UUID idQuerubito) {
		log.info("[inicia] QuerubitoInfraRepository - buscaQuerubitoPeloId");
		var querubito = querubitoSpringDataJPARepository.findById(idQuerubito)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Querubito não encontrado para o idQuerubito = " + idQuerubito));
		log.info("[finaliza] QuerubitoInfraRepository - buscaQuerubitoPeloId");
		return querubito;
	}

	@Override
	public void deletaQuerubito(TipoPontuacaoDoAdolescente querubito) {
		log.info("[inicia] QuerubitoInfraRepository - deletaQuerubito");
		querubitoSpringDataJPARepository.delete(querubito);
		log.info("[finaliza] QuerubitoInfraRepository - deletaQuerubito");
		
	}

}
