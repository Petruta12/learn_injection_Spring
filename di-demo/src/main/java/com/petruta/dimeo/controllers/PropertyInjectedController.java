package com.petruta.dimeo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.petruta.dimeo.service.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	    public GreetingServiceImpl greetingService;

	
	    public String sayHello(){
	        return greetingService.sayGreeting();
	    }

	}

