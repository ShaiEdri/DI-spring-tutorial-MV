package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        return "In PropertyInjectedController:"
                + greetingService.sayHello();
    }
}
