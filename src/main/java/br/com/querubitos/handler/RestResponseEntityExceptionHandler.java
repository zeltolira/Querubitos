package br.com.querubitos.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorAPIResponse> handlerGenericException(APIException ex){
		return ex.buildErrorReponseEntity();
	}

		@ExceptionHandler(Exception.class)
		public ResponseEntity<ErrorAPIResponse> handlerGenericException(Exception ex){
		log.error("Exception: ",ex);
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ErrorAPIResponse.builder()
						.description("INTERNAL SERVER ERROR!")
						.message("POR FAVOR INFORME AO ADMINISTRADOR DO SISTEMA'")
						.build());
	}
}
