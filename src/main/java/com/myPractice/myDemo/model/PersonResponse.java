package com.myPractice.myDemo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude
public class PersonResponse {

	   private Long id;
	   private String name;
	    private String email;
	    private String password;
}
