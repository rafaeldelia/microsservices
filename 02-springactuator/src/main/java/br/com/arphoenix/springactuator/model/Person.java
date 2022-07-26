package br.com.arphoenix.springactuator.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Serializable {

	private static final long serialVersionUID = 7772478764623719861L;

	private Long id;
	private String nome;
	private String endereco;
	private String complemento;
}