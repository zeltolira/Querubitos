package br.com.querubitos.querubitos.application.api;

import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class TipoAcaoAlteracaoRequest {
	@NotNull
	private Integer estudoDiario;
	@NotNull
	private Integer participacaoClasse;
	@NotNull
	private Integer participacaoExternas;
	@NotNull
	private Integer participacaoDesafios;
	@NotNull
	private Integer participacaoCultos;
	@NotNull
	private Integer quiz;
	@NotNull
	private Integer visitantes_amigos;
	@NotNull
	private Integer intercambio;
	@NotNull
	private Integer extra;
	@NotNull
	private Integer desobediencia;
	@NotNull
	private boolean estudo;
}
