package com.javatechie.spring.drools.api;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDroolsApplication.class, args);
	}
	

}
