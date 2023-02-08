package br.com.querubitos.adole.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.querubitos.adole.domain.Sexo;

public class AdolescenteDetalhadoResponse {
	private UUID idAdolescente;
	private String nomeAdolescente;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
}
