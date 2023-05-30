package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        System.out.println(greetingService);
        return "In ConstructorInjectedController:"
                + greetingService.sayHello();
    }
}
