package br.com.querubitos.querubitos.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.querubitos.querubitos.domain.TipoPontuacaoDoAdolescente;
import lombok.Value;

@Value
public class QuerubitoListResponse {

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
			
		public static List<QuerubitoListResponse> converte(List<TipoPontuacaoDoAdolescente> querubitosDoAdolescente) {
			return querubitosDoAdolescente.stream()
					.map(QuerubitoListResponse::new)
					.collect(Collectors.toList());
		}

		public QuerubitoListResponse(TipoPontuacaoDoAdolescente querubitos) {
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