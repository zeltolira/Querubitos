package br.com.querubitos.tipoAcao.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.querubitos.tipoAcao.application.api.TipoAcaoAlteracaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoDoAdolescenteDetalhadoResponse;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoListResponse;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoResponse;

public interface TipoAcaoService {
	TipoAcaoResponse criaQuerubito(UUID idAdolescente, @Valid TipoAcaoRequest querubitoRequest);
	List<TipoAcaoListResponse> buscaQuerubitosDoAdolescenteComID(UUID idAdolescente);
	TipoAcaoDoAdolescenteDetalhadoResponse buscaQuerubitosDoAdolescenteComID(UUID idAdolescente, UUID idQuerubito);
	void deletaQuerubitoClienteComId(UUID idAdolescente, UUID idQuerubito);
	void alteraQuerubitosDoAdolescenteComID(UUID idAdolescente, UUID idQuerubito,
			@Valid TipoAcaoAlteracaoRequest querubitoAlteracaoRequest);
}
