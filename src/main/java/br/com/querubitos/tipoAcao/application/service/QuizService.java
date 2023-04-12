package br.com.querubitos.tipoAcao.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.querubitos.tipoAcao.application.api.request.QuizRequest;
import br.com.querubitos.tipoAcao.application.api.response.QuizResponse;

public interface QuizService {
	QuizResponse criaQuiz(UUID idAdolescente, @Valid QuizRequest quizRequest);

}
