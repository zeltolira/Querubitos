package br.com.querubitos.querubitos.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.querubitos.querubitos.domain.EstudoDiario;
import br.com.querubitos.querubitos.domain.Intercambio;
import br.com.querubitos.querubitos.domain.ParticipacaoCultos;
import br.com.querubitos.querubitos.domain.ParticipacaoDesafios;
import br.com.querubitos.querubitos.domain.ParticipacaoExternas;
import br.com.querubitos.querubitos.domain.Querubitos;
import br.com.querubitos.querubitos.domain.Quiz;
import br.com.querubitos.querubitos.domain.Visitantes_amigos;
import lombok.Value;

@Value
public class QuerubitoListResponse {

		private UUID idQuerubito;
		private EstudoDiario estudoDiario;
		private ParticipacaoExternas participacaoExternas;
		private ParticipacaoDesafios participacaoDesafios;
		private ParticipacaoCultos participacaoCultos;
		private Quiz quiz;
		private Visitantes_amigos visitantes_amigos;
		private Intercambio intercambio;
		private Integer extra;
		private Integer desobediencia;
			
		public static List<QuerubitoListResponse> converte(List<Querubitos> querubitosDoAdolescente) {
			return querubitosDoAdolescente.stream()
					.map(QuerubitoListResponse::new)
					.collect(Collectors.toList());
		}

		public QuerubitoListResponse(Querubitos querubitos) {
			this.idQuerubito = querubitos.getIdQuerubito();
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