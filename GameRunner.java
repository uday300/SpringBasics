
package com.in28minutes.spring_basics.game;

public class GameRunner {
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		
		System.out.println("Game is running");
		game.down();
		game.up();
		game.left();
		game.right();
		
	}
	
	
	

}
