package com.in28minutes.spring_basics;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring_basics.game.GameRunner;
import com.in28minutes.spring_basics.game.PackmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBasicsApplication.class, args);
		
//		MarioGame marioGame = new MarioGame();
//		GameRunner gameRunner = new GameRunner(marioGame);
//		gameRunner.run();
		
		
//		var marioGame = new MarioGame();
//		var gameRunner = new GameRunner(marioGame);
//		gameRunner.run();
		
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PackmanGame(); //object creation
		var gameRunner = new GameRunner(game); //object creation + wiring dependencies
		gameRunner.run();
		
	}

}
