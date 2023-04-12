package br.com.querubitos.adole.application.api.response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.querubitos.adole.domain.Adolescente;
import br.com.querubitos.adole.domain.Sexo;
import lombok.Value;

@Value
public class AdolescenteDetalhadoResponse {
	private UUID idAdolescente;
	private String nomeAdolescente;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;

	
	public AdolescenteDetalhadoResponse(Adolescente adolescente) {
		this.idAdolescente = adolescente.getIdAdolescente();
		this.nomeAdolescente = adolescente.getNomeAdolescente();
		this.dataNascimento = adolescente.getDataNascimento();
		this.celular = adolescente.getCelular();
		this.sexo = adolescente.getSexo();
		this.dataHoraDoCadastro = adolescente.getDataHoraDoCadastro();	
	}	
}