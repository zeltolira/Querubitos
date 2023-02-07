package br.com.querubitos.adole.application.api;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.adole.domain.Adolescente;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AdolescenteResponse {
		private UUID idAdolescente;
}