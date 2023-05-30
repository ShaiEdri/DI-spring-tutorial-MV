package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return "In ConstructorInjectedController:"
                + greetingService.sayHello();
    }
}
