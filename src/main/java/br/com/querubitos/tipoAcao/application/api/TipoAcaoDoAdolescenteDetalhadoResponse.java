package br.com.querubitos.tipoAcao.application.api;

import java.util.UUID;

import br.com.querubitos.tipoAcao.domain.TipoPontuacaoDoAdolescente;
import lombok.Value;

@Value
public class TipoAcaoDoAdolescenteDetalhadoResponse {
	private UUID idTipoPontuacao;
	private UUID idAdolescenteRecebedor;
	private Integer estudoDiario;
	private Integer participacaoClasse;
	private Integer participacaoExternas;
	private Integer participacaoDesafios;
	private Integer participacaoCultos;
	private Integer quiz;
	private Integer visitantes_amigos;
	private Integer intercambio;
	private Integer extra;
	private Integer desobediencia;

	public TipoAcaoDoAdolescenteDetalhadoResponse(TipoPontuacaoDoAdolescente querubito) {
		this.idTipoPontuacao = querubito.getIdTipoPontuacao();
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
