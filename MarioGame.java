package com.in28minutes.spring_basics.game;

public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("mario Jumped");
	}
	public void left() {
		System.out.println("mario took left turn");
	}
	public void right() {
		System.out.println("mario took right turn");
	}
	public void down() {
		System.out.println("Mario is down in the hole");
	}
}
