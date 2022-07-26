package br.com.arphoenix.microsservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedRuntimeException extends RuntimeException {
	private static final long serialVersionUID = -2591635786013819784L;

	public UnsuportedRuntimeException(String mensagem) {
		super(mensagem);
	}
}