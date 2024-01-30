package com.mylearning.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mylearning.learnspringframework.game")
public class GamingAppLauncher {

  @Bean
  public GameRunner gameRunner(GamingConsole game) {
    var gameRunner = new GameRunner(game);
    return gameRunner;
  }

  public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
      context.getBean(GamingConsole.class).up();

      context.getBean(GameRunner.class).run();
    }
  }
}
