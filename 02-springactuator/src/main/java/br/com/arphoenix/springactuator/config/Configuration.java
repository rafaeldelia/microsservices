package br.com.arphoenix.springactuator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("springactuator") // fazer um binding com o yml no nome que deu lá.
@Data
public class Configuration {

	private String greeting;
	private String defaultValue;

	public Configuration() {
	}
}