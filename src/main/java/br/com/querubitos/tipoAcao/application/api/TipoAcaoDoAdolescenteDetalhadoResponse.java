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

	public TipoAcaoDoAdolescenteDetalhadoResponse(TipoPontuacaoDoAdolescente tipoAcao) {
		this.idTipoPontuacao = tipoAcao.getIdTipoPontuacao();
		this.idAdolescenteRecebedor = tipoAcao.getIdAdolescenteRecebedor();
		this.estudoDiario = tipoAcao.getEstudoDiario();
		this.participacaoClasse = tipoAcao.getParticipacaoClasse();
		this.participacaoExternas = tipoAcao.getParticipacaoExternas();
		this.participacaoDesafios = tipoAcao.getParticipacaoDesafios();
		this.participacaoCultos = tipoAcao.getParticipacaoCultos();
		this.quiz = tipoAcao.getQuiz();
		this.visitantes_amigos = tipoAcao.getVisitantes_amigos();
		this.intercambio = tipoAcao.getIntercambio();
		this.extra = tipoAcao.getExtra();
		this.desobediencia = tipoAcao.getDesobediencia();
	}
}
