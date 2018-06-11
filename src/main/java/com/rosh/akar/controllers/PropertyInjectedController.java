package com.rosh.akar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rosh.akar.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingServiceImpl;

	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
}
