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
			
		public static List<TipoAcaoListResponse> converte(List<TipoPontuacaoDoAdolescente> querubitosDoAdolescente) {
			return querubitosDoAdolescente.stream()
					.map(TipoAcaoListResponse::new)
					.collect(Collectors.toList());
		}

		public TipoAcaoListResponse(TipoPontuacaoDoAdolescente querubitos) {
			this.idTipoPontuacao = querubitos.getIdTipoPontuacao();
			this.estudoDiario = querubitos.getEstudoDiario();
			this.participacaoExternas = querubitos.getParticipacaoExternas();
			this.participacaoDesafios = querubitos.getParticipacaoDesafios();
			this.participacaoCultos = querubitos.getParticipacaoCultos();
			this.quiz = querubitos.getQuiz();
			this.visitantes_amigos = querubitos.getVisitantes_amigos();
			this.intercambio = querubitos.getIntercambio();
			this.extra = querubitos.getExtra();
			this.desobediencia = querubitos.getDesobediencia();
		}

}