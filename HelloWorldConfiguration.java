package com.in28minutes.spring_basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {}
record Address(String streetName,String cityName) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 32;
	}
	@Bean
	public String behaviour() {
		System.out.println("He is very nice guy and gentleman");
		return "He is very cool guy";
	}
	
	
	@Bean
	public Person person() {
		Person person = new Person("ravi",20,address());
		System.out.println(person.name()+ " "+person.age());
		return person;
	}
	
	//calling bean method directly 
	//we can create new Bean or call existing bean also
	//instead of calling method directly ,we can use parameters ,name ,age ,address2
	@Bean
	public Person person2CallMethod(String name,int age,Address address2) {
		return new Person(name,age,address2);
	}
	
//	@Bean
//	public Person person2CallMethod() {
//		return new Person(name(),age(),new Address("secondStreet","Bangalore"));
//	}
	
	
//	@Bean
//	public Address addressOne() {
//		Address address = new Address("secondStreet","bangalore");
//		return address;
//	}
//	
	@Bean(name="address2")
	public Address address() {
		Address address = new Address("firstStreet","Tirupathi");
		return address;
	}
}
