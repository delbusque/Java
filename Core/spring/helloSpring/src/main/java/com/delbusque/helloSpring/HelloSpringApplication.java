package com.delbusque.helloSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

		Object output = context.getBean("name");
		System.out.println(output);

	}

}
