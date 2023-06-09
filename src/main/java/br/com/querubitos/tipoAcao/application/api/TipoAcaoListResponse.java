package br.com.querubitos.tipoAcao.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.querubitos.tipoAcao.domain.TipoPontuacaoDoAdolescente;
import lombok.Value;

@Value
public class TipoAcaoListResponse {

		private UUID idTipoPontuacao;
		private Integer estudoDiario;
		private Integer participacaoExternas;
		private Integer participacaoDesafios;
		private Integer participacaoCultos;
		private Integer quiz;
		private Integer visitantes_amigos;
		private Integer intercambio;
		private Integer extra;
		private Integer desobediencia;
			
		public static List<TipoAcaoListResponse> converte(List<TipoPontuacaoDoAdolescente> tipoAcaoDoAdolescente) {
			return tipoAcaoDoAdolescente.stream()
					.map(TipoAcaoListResponse::new)
					.collect(Collectors.toList());
		}

		public TipoAcaoListResponse(TipoPontuacaoDoAdolescente tipoAcao) {
			this.idTipoPontuacao = tipoAcao.getIdTipoPontuacao();
			this.estudoDiario = tipoAcao.getEstudoDiario();
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