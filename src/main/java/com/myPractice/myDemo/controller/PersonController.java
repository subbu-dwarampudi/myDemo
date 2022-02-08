package com.myPractice.myDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myPractice.myDemo.model.PersonRequest;
import com.myPractice.myDemo.model.PersonResponse;
import com.myPractice.myDemo.service.PersonService;

@RestController
@RequestMapping("/v1/person")
public class PersonController {
	
	@Autowired(required = false)
	private PersonService personService;
	
	@PostMapping(path="/createPerson")
	public ResponseEntity<PersonResponse> createUser(@RequestBody PersonRequest personRequest){
		
		
		 PersonResponse createPersons = personService.createPersons(personRequest);
		 return new ResponseEntity<PersonResponse>(createPersons,HttpStatus.CREATED);
		
		
	}

}
