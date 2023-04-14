package br.com.querubitos.querubitos.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.com.querubitos.querubitos.application.api.QuerubitoAlteracaoRequest;
import br.com.querubitos.querubitos.application.api.QuerubitoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "querubitos")
public class TipoPontuacaoDoAdolescente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idQuerubito", updatable = false, unique = true, nullable = false)
	private UUID idTipoPontuacao;
	@NotNull
	private UUID idAdolescenteRecebedor;
	@NotNull
	private Integer estudoDiario = 10;
	@NotNull
	private Integer participacaoClasse = 10;
	@NotNull
	private Integer participacaoExternas = 10;
	@NotNull
	private Integer participacaoDesafios = 10;
	@NotNull
	private Integer participacaoCultos = 10;
	@NotNull
	private Integer quiz = 10;
	@NotNull
	private Integer visitantes_amigos = 10;
	@NotNull
	private Integer intercambio = 10;
	@NotNull
	private Integer extra;
	@NotNull
	private Integer desobediencia;
	
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;

	public TipoPontuacaoDoAdolescente(UUID idAdolescente, @Valid QuerubitoRequest querubitoRequest) {
		this.idAdolescenteRecebedor = idAdolescente;
		this.estudoDiario = querubitoRequest.getEstudoDiario();
		this.participacaoClasse = querubitoRequest.getParticipacaoClasse();
		this.participacaoExternas = querubitoRequest.getParticipacaoExternas();
		this.participacaoDesafios = querubitoRequest.getParticipacaoDesafios();
		this.participacaoCultos = querubitoRequest.getParticipacaoCultos();
		this.quiz = querubitoRequest.getQuiz();
		this.visitantes_amigos = querubitoRequest.getVisitantes_amigos();
		this.intercambio = querubitoRequest.getIntercambio();
		this.extra = querubitoRequest.getExtra();
		this.desobediencia = querubitoRequest.getDesobediencia();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(@Valid QuerubitoAlteracaoRequest querubitoRequest) {
		this.estudoDiario = querubitoRequest.getEstudoDiario();
		this.participacaoClasse = querubitoRequest.getParticipacaoClasse();
		this.participacaoExternas = querubitoRequest.getParticipacaoExternas();
		this.participacaoDesafios = querubitoRequest.getParticipacaoDesafios();
		this.participacaoCultos = querubitoRequest.getParticipacaoCultos();
		this.quiz = querubitoRequest.getQuiz();
		this.visitantes_amigos = querubitoRequest.getVisitantes_amigos();
		this.intercambio = querubitoRequest.getIntercambio();
		this.extra = querubitoRequest.getExtra();
		this.desobediencia = querubitoRequest.getDesobediencia();
		this.dataHoraultimaAlteracao = LocalDateTime.now();		
	}
}