package br.com.querubitos.querubitos.application.api;

import javax.validation.constraints.NotNull;

import br.com.querubitos.querubitos.domain.EstudoDiario;
import br.com.querubitos.querubitos.domain.Intercambio;
import br.com.querubitos.querubitos.domain.ParticipacaoClasse;
import br.com.querubitos.querubitos.domain.ParticipacaoCultos;
import br.com.querubitos.querubitos.domain.ParticipacaoDesafios;
import br.com.querubitos.querubitos.domain.ParticipacaoExternas;
import br.com.querubitos.querubitos.domain.Quiz;
import br.com.querubitos.querubitos.domain.Visitantes_amigos;
import lombok.Value;

@Value
public class QuerubitoAlteracaoRequest {
	@NotNull
	private EstudoDiario estudoDiario;
	@NotNull
	private ParticipacaoClasse participacaoClasse;
	@NotNull
	private ParticipacaoExternas participacaoExternas;
	@NotNull
	private ParticipacaoDesafios participacaoDesafios;
	@NotNull
	private ParticipacaoCultos participacaoCultos;
	@NotNull
	private Quiz quiz;
	@NotNull
	private Visitantes_amigos visitantes_amigos;
	@NotNull
	private Intercambio intercambio;
	@NotNull
	private Integer extra;
	@NotNull
	private Integer desobediencia;
	@NotNull
	private boolean estudo;
}
