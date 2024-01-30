package com.mylearning.learnspringframework.helloworld;

import com.mylearning.learnspringframework.helloworld.Address;
import com.mylearning.learnspringframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02GamingBasicJava {
	public static void main(String[] args) {
		// 1. Launch Spring context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Configure the thing that we want Spring to manage - @Configuration
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2"));
		System.out.println(Address.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
