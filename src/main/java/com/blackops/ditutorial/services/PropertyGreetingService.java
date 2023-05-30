package com.blackops.ditutorial.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "In PropertyInjectedController: Yo";
    }
}
