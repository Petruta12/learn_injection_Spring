package com.petruta.dimeo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.petruta.dimeo.service.GreetingService;

@Controller
public class GetterInjectedController {


	
	    private GreetingService greetingService;

	    public String sayHello(){
	        return greetingService.sayGreeting();
	    }

	    @Autowired
	    public void setGreetingService(GreetingService greetingService) {
	        this.greetingService = greetingService;
	    }
	}

