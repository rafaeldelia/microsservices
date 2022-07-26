package br.com.arphoenix.springactuator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Saudacao {

	private final long id;
	private final String content;
}