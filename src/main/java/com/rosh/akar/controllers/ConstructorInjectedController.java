package com.rosh.akar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rosh.akar.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	// Autowired not needed here anymore... automatic wiring of constructor based
	// components happens now
	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
