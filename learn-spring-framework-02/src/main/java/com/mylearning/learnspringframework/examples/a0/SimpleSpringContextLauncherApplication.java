package com.mylearning.learnspringframework.examples.a0;

import com.mylearning.learnspringframework.game.GameRunner;
import com.mylearning.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

  @Bean
  public GameRunner gameRunner(GamingConsole game) {
    var gameRunner = new GameRunner(game);
    return gameRunner;
  }

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
  }
}
