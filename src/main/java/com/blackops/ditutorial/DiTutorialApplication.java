package com.blackops.ditutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DiTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiTutorialApplication.class, args);
		System.out.println(applicationContext.getBeanDefinitionCount());
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		Arrays.stream(applicationContext.getBeanDefinitionNames())
				.forEach(beanName -> System.out.println(beanName));
	}

}
