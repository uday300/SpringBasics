package com.in28minutes.spring_basics.game;

public class SuperContraGame implements GamingConsole{


	public void up() {
		System.out.println("superContra Jumped");
	}
	public void left() {
		System.out.println("superContra took left turn");
	}
	public void right() {
		System.out.println("superContra took right turn");
	}
	public void down() {
		System.out.println("superContra is down in the hole");
	}
}
