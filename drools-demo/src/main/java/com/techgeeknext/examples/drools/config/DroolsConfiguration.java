package com.techgeeknext.examples.drools.config;




import java.io.File;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

@Configuration
public class DroolsConfiguration {

    private final KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer getKieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        
        try
        {
        	File file = ResourceUtils.getFile("classpath:FDInterestRat.drl");
        	if (file.exists()) 
        	{
        		kieFileSystem.write(ResourceFactory.newClassPathResource("FDInterestRate.drl"));
        	}
            // do one thing
        	else 
        	{
        		kieFileSystem.write(ResourceFactory.newClassPathResource("FDInterestRate.xls"));
        	}
        }
        catch(Exception e)
        {
        	kieFileSystem.write(ResourceFactory.newClassPathResource("FDInterestRate.xls"));
        	System.out.println("Exception occured "+ e);
        }
        
       
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}