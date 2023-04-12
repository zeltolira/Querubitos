package br.com.querubitos.tipoAcao.application.api.request;

import javax.validation.constraints.NotNull;

import lombok.Value;

@Value

public class QuizRequest {

	@NotNull
	private Integer quiz = 10;
}