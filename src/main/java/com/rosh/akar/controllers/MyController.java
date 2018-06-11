package com.rosh.akar.controllers;

import org.springframework.stereotype.Controller;

import com.rosh.akar.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public String hello() {
		System.out.println("Hello!!");

		return greetingService.sayGreeting();
	}

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
