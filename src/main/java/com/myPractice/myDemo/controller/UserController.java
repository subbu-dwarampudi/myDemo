package com.myPractice.myDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user/")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
  
  @GetMapping(path = "getUser/{id}")
  public ResponseEntity<?> getUser(@PathVariable("id") Integer id){
	 
	  logger.info("GET Api has been started executing with userId: {}",id);
	  return new ResponseEntity<String>("Success",HttpStatus.OK);
	  
  }
	
	
}
