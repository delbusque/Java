package com.delbusque.helloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String street, String city) {
}

@Configuration
public class HelloSpringConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 33;
    }

    @Bean
    public Person person() {
        return new Person("Meto", 20);
    }

    @Bean
    public Person person2() {
        return new Person(name(), age());
    }

    @Bean(name = "homeAddress")
    public Address address() {
        return new Address("Lord street", "Southport");
    }

    @Bean(name = "workAddress")
    public Address address2() {
        return new Address("Baker street", "London");
    }

}
