package br.com.arphoenix.microsservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Calculator {

	private final long id;
	private final String content;
}