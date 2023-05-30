package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting(){
        return "In PropertyInjectedController:"
                + greetingService.sayHello();
    }
}
