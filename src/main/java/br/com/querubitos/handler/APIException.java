package br.com.querubitos.handler;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@Log4j2
public class APIException extends RuntimeException{
	private HttpStatusCode statusException;
	private ErrorAPIResponse bodyException;
	
	private APIException(HttpStatus statusException, String message, Exception e) {
		super(message, e);
		this.statusException = statusException;
		this.bodyException = ErrorAPIResponse.builder()
				.message(message)
				.description(getDescription(e))
				.build();
	}

	public static APIException build(HttpStatus statusException, String message, Exception e) {
		log.error("Exception: ", e);
		return new APIException(statusException, message, null);
	}

	public static APIException build(HttpStatus statusException, String message) {
		return new APIException(statusException, message, null);
	}
	
	private String getDescription(Exception e) {
		
		return Optional.ofNullable(e)
				.map(APIException::getMessageCause).orElse(null);
	}

	private static String getMessageCause(Exception e) {
		return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
	}

	public ResponseEntity<ErrorAPIResponse> buildErrorReponseEntity() {
		return ResponseEntity
				.status(statusException)
				.body(bodyException);
	}

	private static final long serialVersionUID = 1L;

}