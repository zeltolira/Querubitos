package br.com.querubitos.adole.application.api.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import br.com.querubitos.adole.domain.Sexo;
import lombok.NonNull;
import lombok.Value;

@Value
public class AdolescenteRequest {

	@NotBlank
	private String nomeAdolescente;
	@NonNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NonNull
	private Sexo sexo;
}
