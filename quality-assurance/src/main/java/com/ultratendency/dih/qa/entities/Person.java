package com.ultratendency.dih.qa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String passportNumber;
	
	public Person(Long id, String name, String passportNumber) {
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}
	
	public Person() {}
	
}
