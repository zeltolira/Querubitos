package br.com.querubitos.querubitos.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	private Integer estudoDiario;
	@NotNull
	private Integer participacaoClasse;
	@NotNull
	private Integer Externas;
	@NotNull
	private Integer Desafios;
	@NotNull
	private Integer  Cultos;
	@NotNull
	private Integer Quiz;
	@NotNull
	private Integer Visitantes_amigos;
	@NotNull
	private Integer Intercambio;
	@NotNull
	private Integer desobediencia;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;
}