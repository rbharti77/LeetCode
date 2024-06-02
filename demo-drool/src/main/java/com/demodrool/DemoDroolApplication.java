package com.demodrool;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoDroolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDroolApplication.class, args);
	}
	@Bean
	public KieContainer kieContainer() {
	return KieServices.Factory.get().getKieClasspathContainer();
	}


}
