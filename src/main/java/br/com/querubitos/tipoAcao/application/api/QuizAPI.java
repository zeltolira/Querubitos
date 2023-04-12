package br.com.querubitos.tipoAcao.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.querubitos.tipoAcao.application.api.request.QuizRequest;
import br.com.querubitos.tipoAcao.application.api.response.QuizResponse;

@RestController
@RequestMapping("/v1/adole")
public interface QuizAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	QuizResponse postQuiz(@Valid @RequestBody QuizRequest quizRequest);
}
