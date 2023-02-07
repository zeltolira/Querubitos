package br.com.querubitos.adole.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.querubitos.adole.domain.Adolescente;
import br.com.querubitos.adole.domain.Sexo;

public class AdolescenteListResponse {
	private UUID idAdolescente;
	private String nomeAdolescente;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
	
	public static List<AdolescenteListResponse> converte(List<Adolescente> adolescentes) {
		return null;
	}
	
}
