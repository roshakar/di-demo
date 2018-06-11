package com.rosh.akar.controllers;

import com.rosh.akar.services.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
