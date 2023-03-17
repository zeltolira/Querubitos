package br.com.querubitos.querubitos.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/adole/{idAdolescente}/querubito")
public interface QuerubitoAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	QuerubitoResponse postQuerubito(@PathVariable UUID idAdolescente,
			@Valid @RequestBody QuerubitoRequest querubitoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<QuerubitoListResponse> getQuerubitosDoAdolecente(@PathVariable UUID idAdolescente);
	
	@GetMapping(value = "/{idQuerubito}")
	@ResponseStatus(code = HttpStatus.OK)
	QuerubitoDoAdolescenteDetalhadoResponse getQuerubitoDoAdolescenteAtravesId(@PathVariable UUID idAdolescente, @PathVariable UUID idQuerubito);

	@DeleteMapping(value = "/{idQuerubito}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaQuerubitoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idPet);
	
	@PatchMapping(value = "/{idQuerubito}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchQuerubito(@PathVariable UUID idAdolescente, @PathVariable UUID idQuerubito,
			@Valid @RequestBody QuerubitoAlteracaoRequest querubitoAlteracaoRequest);
}
