package br.com.arphoenix.springactuator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.arphoenix.springactuator.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	public Person findById(Long id) {
		return new Person(counter.incrementAndGet(), "Rafael", "Rua Coronel Paulo Malta Rezende", "apto 810 bloco: " + id);
	}

	public List<Person> findAllPersons() {
		List<Person> pessoas = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			pessoas.add(mockAddPerson(i));
		}
		return pessoas;
	}

	private Person mockAddPerson(int i) {
		return new Person(counter.incrementAndGet(), "Rafael" + i, "Rua Coronel Paulo Malta Rezende" + i, "apto 810 bloco 02" + i);
	}
}
