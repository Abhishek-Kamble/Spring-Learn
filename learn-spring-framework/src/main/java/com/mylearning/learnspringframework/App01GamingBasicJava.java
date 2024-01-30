package com.mylearning.learnspringframework;

import com.mylearning.learnspringframework.game.GameRunner;
import com.mylearning.learnspringframework.game.MarioGame;
import com.mylearning.learnspringframework.game.PacmanGame;
import com.mylearning.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		
		var game = new PacmanGame(); 				//1. object creation
		
		var gameRunner = new GameRunner(game);		//2. object creation + wiring of dependencies
		gameRunner.run();
	}
}
