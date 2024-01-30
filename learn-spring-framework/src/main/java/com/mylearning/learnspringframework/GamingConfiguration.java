package com.mylearning.learnspringframework;

import com.mylearning.learnspringframework.game.GameRunner;
import com.mylearning.learnspringframework.game.GamingConsole;
import com.mylearning.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

  @Bean
  public GamingConsole game() {
    var game = new PacmanGame();
    return game;
  }

  @Bean
  public GameRunner gameRunner(GamingConsole game) {
    var gameRunner = new GameRunner(game);
    return gameRunner;
  }

//
//
//  var game = new PacmanGame(); 				//1. object creation
//
//  var gameRunner = new GameRunner(game);		//2. object creation + wiring of dependencies
//  gameRunner.run();
}
