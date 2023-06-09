package br.com.querubitos.tipoAcao.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.tipoAcao.domain.TipoPontuacaoDoAdolescente;

public interface TipoAcaoRepository {
	TipoPontuacaoDoAdolescente salvaTipoAcao(TipoPontuacaoDoAdolescente tipoAcao);
	List<TipoPontuacaoDoAdolescente> buscaTipoAcaoDoAdolescenteComID(UUID idAdolescente);
	TipoPontuacaoDoAdolescente buscaTipoAcaoPeloId(UUID idTipoAcao);
	void deletaTipoAcao(TipoPontuacaoDoAdolescente tipoAcao);
}
