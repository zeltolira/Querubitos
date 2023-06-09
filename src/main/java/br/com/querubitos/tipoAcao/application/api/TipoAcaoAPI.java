package br.com.querubitos.tipoAcao.application.api;

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
@RequestMapping("/v1/adole/{idAdolescente}/tipoAcao")
public interface TipoAcaoAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	TipoAcaoResponse postTipoAcao(@PathVariable UUID idAdolescente,
			@Valid @RequestBody TipoAcaoRequest tipoAcaoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<TipoAcaoListResponse> getTipoAcaoDoAdolecente(@PathVariable UUID idAdolescente);
	
	@GetMapping(value = "/{idTipoAcao}")
	@ResponseStatus(code = HttpStatus.OK)
	TipoAcaoDoAdolescenteDetalhadoResponse getTipoAcaoDoAdolescenteAtravesId(@PathVariable UUID idAdolescente, @PathVariable UUID idTipoAcao);

	@DeleteMapping(value = "/{idTipoAcao}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaTipoAcaoClienteComId(@PathVariable UUID idAdolescente, @PathVariable UUID idTipoAcao);
	
	@PatchMapping(value = "/{idTipoAcao}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchTipoAcao(@PathVariable UUID idAdolescente, @PathVariable UUID idTipoAcao,
			@Valid @RequestBody TipoAcaoAlteracaoRequest tipoAcaoAlteracaoRequest);
}
