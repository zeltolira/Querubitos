package br.com.querubitos.tipoAcao.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.querubitos.tipoAcao.application.api.request.QuizRequest;
import br.com.querubitos.tipoAcao.application.api.response.QuizResponse;
import br.com.querubitos.tipoAcao.application.service.QuizService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class QuizController implements QuizAPI {

	private final QuizService quizService;

	@Override
	public QuizResponse postQuiz(UUID idAdolescente, @Valid QuizRequest quizRequest) {
		log.info("[inicia] QuizController - postQuiz");
		log.info("[idAdolescente] {}, idAdolescente");
		QuizResponse quiz = quizService.criaQuiz(idAdolescente, quizRequest);
		log.info("[finaliza] QuizController - postQuiz");
		return quiz;
	}

}
