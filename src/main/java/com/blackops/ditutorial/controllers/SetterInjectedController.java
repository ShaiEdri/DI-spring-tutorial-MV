package com.blackops.ditutorial.controllers;

import com.blackops.ditutorial.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        System.out.println(greetingService);
        return "In SetterInjectedController:"
                + greetingService.sayHello();
    }
}
