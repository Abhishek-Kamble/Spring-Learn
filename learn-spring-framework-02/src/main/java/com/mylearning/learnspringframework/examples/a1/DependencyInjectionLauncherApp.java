package com.mylearning.learnspringframework.examples.a1;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.mylearning.learnspringframework.game.GameRunner;
import com.mylearning.learnspringframework.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
class YourBusinessClass{
  Dependency1 dependency1;
  Dependency2 dependency2;

  @Autowired // Autowired is not mandatory
  public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
    System.out.println("Constructor injection!");
    this.dependency1 = dependency1;
    this.dependency2 = dependency2;
  }

  public String toString() {
    return "Using " + dependency1 + " and " + dependency2;
  }

//  @Autowired
//  public void setDependency1(Dependency1 dependency1) {
//    System.out.println("Dependency 1 called");
//    this.dependency1 = dependency1;
//  }
//
//  @Autowired
//  public void setDependency2(Dependency2 dependency2) {
//    System.out.println("Dependency 2 called");
//    this.dependency2 = dependency2;
//  }
}

@Component
class Dependency1{
}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApp {

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApp.class)) {
//      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println(context.getBean(YourBusinessClass.class).toString());
    }
  }
}
