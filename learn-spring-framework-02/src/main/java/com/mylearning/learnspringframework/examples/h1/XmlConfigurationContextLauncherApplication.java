package com.mylearning.learnspringframework.examples.h1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class XmlConfigurationContextLauncherApplication {
  public static void main(String[] args) {
    try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println(context.getBean("name"));
    }
  }
}
