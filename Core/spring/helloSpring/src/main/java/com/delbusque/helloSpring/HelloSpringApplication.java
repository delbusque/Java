package com.delbusque.helloSpring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

		Object name = context.getBean("name");

		System.out.println(name);
		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("methodCallPerson"));
		System.out.println(context.getBean("parametersPerson"));

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(context.getBean("workAddress"));
		System.out.println(context.getBean("parametersQualifierPerson"));
		System.out.println(context.getBean(Address.class));

	}

}
