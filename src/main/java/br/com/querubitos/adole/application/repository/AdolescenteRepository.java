package br.com.querubitos.adole.application.repository;

import java.util.List;

import br.com.querubitos.adole.domain.Adolescente;

public interface AdolescenteRepository {
	Adolescente salva(Adolescente adolescente);
	List<Adolescente> buscaTodosAdolescentes();
}
