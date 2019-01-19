package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 42;
		int userGuess = 100;

		do {
			if (userGuess > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				userGuess--;
			} else if (userGuess < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				userGuess++;
			}
		} while (userGuess != hiddenNumber);
		System.out.println("Вы угадали! Загаданное число: " + hiddenNumber);
	}
}