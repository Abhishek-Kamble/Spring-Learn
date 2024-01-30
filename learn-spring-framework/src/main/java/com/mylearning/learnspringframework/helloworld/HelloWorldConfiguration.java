package com.mylearning.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Abhishek";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		return new Person("Abhi", 25);
	}
	
	@Bean("address2")
	public Address address() {
		return new Address("Aundh", "Pune");
	}

	@Bean
	public Person person2() {
		return new Person(name(), age());
	}
}
