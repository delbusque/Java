package com.delbusque.helloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String street, String city) {
}

record ExtendedPerson(String name, int age, Address address) {
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

    @Bean
    public ExtendedPerson methodCallPerson() {
        return new ExtendedPerson(name(), age(), new Address("The Promenade", "Southport"));
    }

    @Bean
    public ExtendedPerson parameterPerson(String name, int age, Address homeAddress) {
        return new ExtendedPerson(name, age, homeAddress);
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
