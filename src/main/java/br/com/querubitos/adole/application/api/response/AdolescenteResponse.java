package br.com.querubitos.adole.application.api.response;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AdolescenteResponse {
		private UUID idAdolescente;
}