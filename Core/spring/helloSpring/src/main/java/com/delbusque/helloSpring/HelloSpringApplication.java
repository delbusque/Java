package com.delbusque.helloSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

		Object name = context.getBean("name");

		System.out.println(name);
		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));

		System.out.println(context.getBean("homeAddress"));
		// System.out.println(context.getBean(Address.class));

	}

}
