package com.in28minutes.spring_basics.game;

public class PackmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("packman is up");
	}

	@Override
	public void down() {
		System.out.println("packman is down");
	}

	@Override
	public void right() {
		System.out.println("packman took right turn");
	}

	@Override
	public void left() {
		System.out.println("packman took left turn");
	}

}
