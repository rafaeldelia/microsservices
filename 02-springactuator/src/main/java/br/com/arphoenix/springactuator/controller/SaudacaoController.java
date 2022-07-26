package br.com.arphoenix.springactuator.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.arphoenix.springactuator.config.Configuration;
import br.com.arphoenix.springactuator.model.Saudacao;

@RestController
@RequestMapping("/saudacao")
public class SaudacaoController {

	@Autowired
	private Configuration config;

	private final String template = "%s, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/hello")
	public Saudacao getHello(@RequestParam(name = "nome", defaultValue = "") String nome) {
		if (nome.isEmpty()) {
			nome = config.getDefaultValue();
		}
		return new Saudacao(counter.incrementAndGet(), String.format(template, config.getGreeting(), nome));
	}
}