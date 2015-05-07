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
    public Docket configSpringfoxDocket_foo() {       
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("foo")
            .produces(Sets.newHashSet("application/json")) 
            .consumes(Sets.newHashSet("application/json")) 
            .protocols(Sets.newHashSet("http", "https")) 
            .forCodeGeneration(true) 
            .select().paths(regex(".*foo.*")) 
            .build();
    }
    
    @Bean
    public Docket configSpringfoxDocket_bar() {       
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("bar")
            .produces(Sets.newHashSet("application/json")) 
            .consumes(Sets.newHashSet("application/json")) 
            .protocols(Sets.newHashSet("http", "https")) 
            .useDefaultResponseMessages(false)
            .forCodeGeneration(true) 
            .select().paths(regex(".*bar.*")) 
            .build();
    }
}