package com.startjava.lesson_2_3.game;

public class Player {

	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public int setNumber(int number) {
		this.number = number;
		return number;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
}