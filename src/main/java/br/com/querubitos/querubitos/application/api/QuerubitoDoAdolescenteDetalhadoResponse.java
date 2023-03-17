package br.com.querubitos.querubitos.application.api;

import java.util.UUID;

import br.com.querubitos.querubitos.domain.EstudoDiario;
import br.com.querubitos.querubitos.domain.Intercambio;
import br.com.querubitos.querubitos.domain.ParticipacaoClasse;
import br.com.querubitos.querubitos.domain.ParticipacaoCultos;
import br.com.querubitos.querubitos.domain.ParticipacaoDesafios;
import br.com.querubitos.querubitos.domain.ParticipacaoExternas;
import br.com.querubitos.querubitos.domain.Querubitos;
import br.com.querubitos.querubitos.domain.Quiz;
import br.com.querubitos.querubitos.domain.Visitantes_amigos;
import lombok.Value;

@Value
public class QuerubitoDoAdolescenteDetalhadoResponse {
	private UUID idQuerubito;
	private UUID idAdolescenteRecebedor;
	private EstudoDiario estudoDiario;
	private ParticipacaoClasse participacaoClasse;
	private ParticipacaoExternas participacaoExternas;
	private ParticipacaoDesafios participacaoDesafios;
	private ParticipacaoCultos participacaoCultos;
	private Quiz quiz;
	private Visitantes_amigos visitantes_amigos;
	private Intercambio intercambio;
	private Integer extra;
	private Integer desobediencia;

	public QuerubitoDoAdolescenteDetalhadoResponse(Querubitos querubito) {
		this.idQuerubito = querubito.getIdQuerubito();
		this.idAdolescenteRecebedor = querubito.getIdAdolescenteRecebedor();
		this.estudoDiario = querubito.getEstudoDiario();
		this.participacaoClasse = querubito.getParticipacaoClasse();
		this.participacaoExternas = querubito.getParticipacaoExternas();
		this.participacaoDesafios = querubito.getParticipacaoDesafios();
		this.participacaoCultos = querubito.getParticipacaoCultos();
		this.quiz = querubito.getQuiz();
		this.visitantes_amigos = querubito.getVisitantes_amigos();
		this.intercambio = querubito.getIntercambio();
		this.extra = querubito.getExtra();
		this.desobediencia = querubito.getDesobediencia();
	}
}
