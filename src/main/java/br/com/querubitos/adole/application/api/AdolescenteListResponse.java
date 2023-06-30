package br.com.querubitos.adole.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.querubitos.adole.domain.Adolescente;
import br.com.querubitos.adole.domain.Sexo;
import lombok.Value;

@Value
public class AdolescenteListResponse {
	private UUID idAdolescente;
	private String nomeAdolescente;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
	
	public static List<AdolescenteListResponse> converte(List<Adolescente> adolescentes) {
		return adolescentes.stream()
				.map(AdolescenteListResponse::new)
				.collect(Collectors.toList());
	}

	private AdolescenteListResponse(Adolescente adolescente) {
		this.idAdolescente = adolescente.getIdAdolescente();
		this.nomeAdolescente = adolescente.getNomeAdolescente();
		this.dataNascimento = adolescente.getDataNascimento();
		this.celular = adolescente.getCelular();
		this.sexo = adolescente.getSexo();
	}
	
}