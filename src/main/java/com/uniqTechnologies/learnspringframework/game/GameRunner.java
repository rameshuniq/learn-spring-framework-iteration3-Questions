package com.uniqTechnologies.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	//@Autowired
	private GamingConsole game;
	
	@Autowired
	public GameRunner(GamingConsole game) {
		System.out.println("using Constructor");
		this.game = game;
	}

	/*@Autowired
	 public void setGame(GamingConsole game) {
	 System.out.println("Using Setter");
	 this.game = game;
	 }*/

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
