package br.com.querubitos.adole.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

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
}
