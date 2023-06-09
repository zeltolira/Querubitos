package br.com.querubitos.tipoAcao.domain;

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

import br.com.querubitos.tipoAcao.application.api.TipoAcaoAlteracaoRequest;
import br.com.querubitos.tipoAcao.application.api.TipoAcaoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "tipoAcao")
public class TipoPontuacaoDoAdolescente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idTipoPontuacao", updatable = false, unique = true, nullable = false)
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

	public TipoPontuacaoDoAdolescente(UUID idAdolescente, @Valid TipoAcaoRequest tipoAcaoRequest) {
		this.idAdolescenteRecebedor = idAdolescente;
		this.estudoDiario = tipoAcaoRequest.getEstudoDiario();
		this.participacaoClasse = tipoAcaoRequest.getParticipacaoClasse();
		this.participacaoExternas = tipoAcaoRequest.getParticipacaoExternas();
		this.participacaoDesafios = tipoAcaoRequest.getParticipacaoDesafios();
		this.participacaoCultos = tipoAcaoRequest.getParticipacaoCultos();
		this.quiz = tipoAcaoRequest.getQuiz();
		this.visitantes_amigos = tipoAcaoRequest.getVisitantes_amigos();
		this.intercambio = tipoAcaoRequest.getIntercambio();
		this.extra = tipoAcaoRequest.getExtra();
		this.desobediencia = tipoAcaoRequest.getDesobediencia();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(@Valid TipoAcaoAlteracaoRequest tipoAcaoRequest) {
		this.estudoDiario = tipoAcaoRequest.getEstudoDiario();
		this.participacaoClasse = tipoAcaoRequest.getParticipacaoClasse();
		this.participacaoExternas = tipoAcaoRequest.getParticipacaoExternas();
		this.participacaoDesafios = tipoAcaoRequest.getParticipacaoDesafios();
		this.participacaoCultos = tipoAcaoRequest.getParticipacaoCultos();
		this.quiz = tipoAcaoRequest.getQuiz();
		this.visitantes_amigos = tipoAcaoRequest.getVisitantes_amigos();
		this.intercambio = tipoAcaoRequest.getIntercambio();
		this.extra = tipoAcaoRequest.getExtra();
		this.desobediencia = tipoAcaoRequest.getDesobediencia();
		this.dataHoraultimaAlteracao = LocalDateTime.now();		
	}
}