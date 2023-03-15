package br.com.querubitos.querubitos.application.api;

import java.util.List;
import java.util.UUID;

import br.com.querubitos.querubitos.domain.Querubitos;
import lombok.Value;

@Value
public class QuerubitoResponse {
	private UUID idQuerubito;

	public static List<QuerubitoListResponse> converte(List<Querubitos> querubitosDoAdolescente) {
		return null;
	}
}
