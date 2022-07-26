package br.com.arphoenix.microsservices.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.arphoenix.microsservices.Saudacao;

@RestController
public class SaudacaoController {
	private final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/saudar")
	public Saudacao getSaudacao(@RequestParam(name = "nome", defaultValue = "Rafael D'Elia") String nome) {
		return new Saudacao(counter.incrementAndGet(), String.format(template, nome));
	}
}