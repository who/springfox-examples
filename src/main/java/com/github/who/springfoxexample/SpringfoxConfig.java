package com.github.who.springfoxexample;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
import springfox.documentation.spi.DocumentationType;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.spring.web.plugins.Docket;
 
@Configuration
@EnableSwagger2
public class SpringfoxConfig {
    
    @Bean
    public Docket configSpringfoxDocket_all() {       
        return new Docket(DocumentationType.SWAGGER_2)
            .produces(Sets.newHashSet("application/json")) 
            .consumes(Sets.newHashSet("application/json")) 
            .protocols(Sets.newHashSet("http", "https")) 
            .forCodeGeneration(true) 
            .select().paths(regex(".*")) 
            .build();
    }

    @Bean
    public Docket configSpringfoxDocket_withDefaultResponses() {       
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("withDefaultResponses")
            .produces(Sets.newHashSet("application/json")) 
            .consumes(Sets.newHashSet("application/json")) 
            .protocols(Sets.newHashSet("http", "https")) 
            .forCodeGeneration(true) 
            .select().paths(regex(".*withDefaultResponses.*")) 
            .build();
    }
    
    @Bean
    public Docket configSpringfoxDocket_withoutDefaultResponses() {       
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("withoutDefaultResponses")
            .produces(Sets.newHashSet("application/json")) 
            .consumes(Sets.newHashSet("application/json")) 
            .protocols(Sets.newHashSet("http", "https")) 
            .useDefaultResponseMessages(false)
            .forCodeGeneration(true) 
            .select().paths(regex(".*withoutDefaultResponses.*")) 
            .build();
    }
}