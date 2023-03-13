package br.com.querubitos.querubitos.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class Querubito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idQuerubito", updatable = false, unique = true, nullable = false)
	private UUID idQuerubito;
	@NotNull
	@Enumerated(EnumType.STRING)
	private EstudoDiario estudoDiario;
	@NotNull
	private Integer participacaoClasse;
	@NotNull
	private Integer participacaoExternas;
	@NotNull
	private Integer participacaoDesafios;
	@NotNull
	private Integer participacaoCultos;
	@NotNull
	private Integer quiz;
	@NotNull
	private Integer visitantes_amigos;
	@NotNull
	private Integer intercambio;
	@NotNull
	private Integer extra;
	@NotNull
	private Integer desobediencia;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;
}