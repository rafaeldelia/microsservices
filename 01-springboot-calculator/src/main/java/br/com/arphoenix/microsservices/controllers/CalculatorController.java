package br.com.arphoenix.microsservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.arphoenix.microsservices.exception.UnsuportedRuntimeException;

@RestController
public class CalculatorController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedRuntimeException("Please, set a numeric value!");
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private static Double convertToDouble(String number) {
		if (number == null) {
			return 0D;
		}
		if (isNumeric(number)) {
			return Double.parseDouble(number.replaceAll(",", "."));
		}
		return 0D;
	}

	private static boolean isNumeric(String number) {
		if (number == null) {
			return false;
		}
		String numero = number.replaceAll(",", ".");
		return numero.matches("^[A-Za-z0-9]*\\d+[A-Za-z0-9]*$");
	}
}