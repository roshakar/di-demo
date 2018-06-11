package com.rosh.akar.controllers;

import com.rosh.akar.services.GreetingServiceImpl;

public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}
}
