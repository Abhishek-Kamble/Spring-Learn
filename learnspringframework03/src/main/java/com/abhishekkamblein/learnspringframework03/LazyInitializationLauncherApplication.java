package com.abhishekkamblein.learnspringframework03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
  public ClassA() {
    System.out.println("Logic in class A");
  }
}

@Component
@Lazy
class ClassB {
  private ClassA classA;
  public ClassB (ClassA classA) {
    System.out.println("Some business logic");
    this.classA = classA;
  }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB(classA);
    }
  }
}
