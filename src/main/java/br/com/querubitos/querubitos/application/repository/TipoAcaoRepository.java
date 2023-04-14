package br.com.querubitos.querubitos.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.querubitos.domain.TipoPontuacaoDoAdolescente;

public interface TipoAcaoRepository {
	TipoPontuacaoDoAdolescente salvaQuerubito(TipoPontuacaoDoAdolescente querubito);
	List<TipoPontuacaoDoAdolescente> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente);
	TipoPontuacaoDoAdolescente buscaQuerubitoPeloId(UUID idQuerubito);
	void deletaQuerubito(TipoPontuacaoDoAdolescente querubito);
}
