package com.blackops.ditutorial;

import com.blackops.ditutorial.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DiTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiTutorialApplication.class, args);

		//MyController
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		//MyController
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.getGreeting());

		//Property injected controller
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		//Setter injected controller
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		//Constructor injected controller
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
