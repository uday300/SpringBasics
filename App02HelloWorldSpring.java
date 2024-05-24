package com.in28minutes.spring_basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//Launch a spring context 
		
		//Spring context, spring container , bean ,AnnotationConfigApplicationContext 
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//Configure the things that we want sprint to manage -@Configuration
		//Retriving beans by managing beans 
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("behaviour"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2CallMethod"));

		
		//based on the bean name or type we can get bean 
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));


	}

}
