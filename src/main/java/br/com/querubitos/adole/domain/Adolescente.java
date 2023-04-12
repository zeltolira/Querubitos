package br.com.querubitos.adole.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.querubitos.adole.application.api.request.AdolescenteAlteracaoRequest;
import br.com.querubitos.adole.application.api.request.AdolescenteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@Entity
@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Table(name = "adolescente")
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