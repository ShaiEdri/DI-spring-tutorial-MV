package com.blackops.ditutorial.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "In ConstructorInjectedController: Yo";
    }
}
