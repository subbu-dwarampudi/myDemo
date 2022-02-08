package com.myPractice.myDemo.service;

import org.springframework.stereotype.Service;

import com.myPractice.myDemo.model.PersonRequest;
import com.myPractice.myDemo.model.PersonResponse;

@Service
public interface PersonService {
	
	public PersonResponse createPersons(PersonRequest personRequest);
	

}
