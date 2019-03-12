package com.ultratendency.dih.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ultratendency.dih.qa.entities.Person;
import com.ultratendency.dih.qa.repository.PersonRepository;


@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	PersonRepository personRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Person createPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public Person updatePerson(@PathVariable String passportNumber, @RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Person> getAll() {
		return personRepository.findAll();
	}
	
	@GetMapping("/count")
	@ResponseStatus(HttpStatus.OK)
	public Integer getCount() {
		return personRepository.findAll().size();
	}
	
}
