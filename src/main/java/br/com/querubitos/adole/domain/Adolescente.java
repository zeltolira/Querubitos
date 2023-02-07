package br.com.querubitos.adole.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@Entity
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class Adolescente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idAdolescente;
	@NotBlank
	private String nomeAdolescente;
	@NotBlank
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NonNull
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;
	
	public Adolescente(@NotBlank String nomeAdolescente, @NotBlank LocalDate dataNascimento, @NotBlank String celular,
			Sexo sexo) {
		this.idAdolescente = UUID.randomUUID();
		this.nomeAdolescente = nomeAdolescente;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
		this.sexo = sexo;
	}
	
	
}