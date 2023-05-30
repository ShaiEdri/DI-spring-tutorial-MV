package com.blackops.ditutorial.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "In PrimaryInjectedController: Yo";
    }
}
