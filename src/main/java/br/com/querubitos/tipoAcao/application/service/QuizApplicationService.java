package br.com.querubitos.tipoAcao.application.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.querubitos.tipoAcao.application.api.request.QuizRequest;
import br.com.querubitos.tipoAcao.application.api.response.QuizResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class QuizApplicationService implements QuizService {

	@Override
	public QuizResponse criaQuiz(UUID idAdolescente, @Valid QuizRequest quizRequest) {
		log.info("[inicia] QuizApplicationService - criaQuiz");
		log.info("[finaliza] QuizApplicationService - criaQuiz");
		return null;
	}

}
