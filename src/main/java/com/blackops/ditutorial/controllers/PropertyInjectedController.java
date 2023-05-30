package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        System.out.println(greetingService);
        return "In PropertyInjectedController:"
                + greetingService.sayHello();
    }
}
