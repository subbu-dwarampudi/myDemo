package com.myPractice.myDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myPractice.myDemo.dto.Person;
import com.myPractice.myDemo.model.PersonRequest;
import com.myPractice.myDemo.model.PersonResponse;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	public Person save(Person person);

}
