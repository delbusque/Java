package com.delbusque.helloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

}
