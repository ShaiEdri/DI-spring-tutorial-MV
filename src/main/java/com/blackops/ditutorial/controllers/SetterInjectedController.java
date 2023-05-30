package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return "In SetterInjectedController:"
                + greetingService.sayHello();
    }
}
