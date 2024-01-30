package com.abhishekkamblein.learnspringframework03;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContextApplicationLauncher {

//	public int findMax() {
//		return Arrays.stream()
//	}
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextApplicationLauncher.class)){
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Maximum " + context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
