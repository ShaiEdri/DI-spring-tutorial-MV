package com.blackops.ditutorial.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello Yo - EN";
    }
}
