package br.com.querubitos.adole.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AdolescenteResponse {
		private UUID idAdolescente;
}