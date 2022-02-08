package com.myPractice.myDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myPractice.myDemo.dto.Person;
import com.myPractice.myDemo.model.PersonRequest;
import com.myPractice.myDemo.model.PersonResponse;
import com.myPractice.myDemo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public PersonResponse createPersons(PersonRequest personRequest) {
		
		Person person =new Person();
		person.setName(personRequest.getName());
		person.setPassword(personRequest.getPassword());;
		person.setEmail(personRequest.getEmail());
		Person save = personRepository.save(person);
		PersonResponse personResponse = new PersonResponse();
		personResponse.setId(save.getId());
		personResponse.setName(personRequest.getName());
		personResponse.setPassword(personRequest.getPassword());;
		personResponse.setEmail(personRequest.getEmail());
		return personResponse;
		
		
		
	}
	

}
