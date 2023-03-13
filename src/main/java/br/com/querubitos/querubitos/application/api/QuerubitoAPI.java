package br.com.querubitos.querubitos.application.api;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/adole/{idAdolescente}/querubito")
public interface QuerubitoAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	QuerubitoResponse postQuerubito(@PathVariable UUID idAdolescente,
			@Valid @RequestBody QuerubitoRequest querubitoRequest);

}
