package br.com.querubitos.adole.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.querubitos.adole.application.api.AdolescenteAlteracaoRequest;
import br.com.querubitos.adole.application.api.AdolescenteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idAdolescente;
	@NotBlank
	private String nomeAdolescente;
	@NonNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NotNull
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;
	
	public Adolescente(AdolescenteRequest adolescenteRequest) {
		this.nomeAdolescente = adolescenteRequest.getNomeAdolescente();
		this.dataNascimento = adolescenteRequest.getDataNascimento();
		this.celular = adolescenteRequest.getCelular();
		this.sexo = adolescenteRequest.getSexo();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(AdolescenteAlteracaoRequest adolescenteRequest) {
		this.nomeAdolescente = adolescenteRequest.getNomeAdolescente();
		this.dataNascimento = adolescenteRequest.getDataNascimento();
		this.celular = adolescenteRequest.getCelular();
		this.sexo = adolescenteRequest.getSexo();
		this.dataHoraultimaAlteracao = LocalDateTime.now();
	}
}