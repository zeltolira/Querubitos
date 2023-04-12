package br.com.querubitos.adole.application.api;

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

import br.com.querubitos.adole.application.api.request.AdolescenteAlteracaoRequest;
import br.com.querubitos.adole.application.api.request.AdolescenteRequest;
import br.com.querubitos.adole.application.api.response.AdolescenteDetalhadoResponse;
import br.com.querubitos.adole.application.api.response.AdolescenteListResponse;
import br.com.querubitos.adole.application.api.response.AdolescenteResponse;

@RestController
@RequestMapping("/v1/adole")
public interface AdolescenteAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	AdolescenteResponse postAdolescente(@Valid @RequestBody AdolescenteRequest adolescenteRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<AdolescenteListResponse> getTodosAdolescentes();

	@GetMapping(value = "/{idAdolescente}")
	@ResponseStatus(code = HttpStatus.OK)
	AdolescenteDetalhadoResponse getAdolescentesAtravesId(@PathVariable UUID idAdolescente);

	@DeleteMapping(value = "/{idAdolescente}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaAdolescenteAtravesId(@PathVariable UUID idAdolescente);
	
	@PatchMapping(value = "/{idAdolescente}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraAdolescente(@PathVariable UUID idAdolescente, @Valid @RequestBody AdolescenteAlteracaoRequest adolescenteAlteracaoRequest);
}
