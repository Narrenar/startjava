package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {

	Scanner scan = new Scanner(System.in);
	private int hiddenNumber;
	private boolean startGame;
	private Player player1, player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void gameProces() {
		System.out.println("\nA new game has STARTED! \n");	
		System.out.println("Guess the hidden number from 0 to 100. \n__________ \n");	
		hiddenNumber = (int)(Math.random()*101);

		startGame = true;
		while(startGame) {
			System.out.println(player1.getName() + "'s guess is:");
			player1.setNumber(scan.nextInt());
			if(player1.getNumber() > hiddenNumber) {
				System.out.println("\nYour number is bigger then the guessed one. \n__________ \n");
			} else if(player1.getNumber() < hiddenNumber) {
				System.out.println("\nYour number is lower then the guessed one. \n__________ \n");
			} else if(player1.getNumber() == hiddenNumber) {
				System.out.println("\n" + player1.getName() + " HAS WON THE GAME! \nThe hidden number is: " + hiddenNumber);
				break;
			} else {
				System.out.println("WRONG VALUE. You've lost your turn.");
			}

			System.out.println(player2.getName() + "'s guess is:");
			player2.setNumber(scan.nextInt());
			if(player2.getNumber() > hiddenNumber) {
				System.out.println("Your number is bigger then the guessed one. \n__________ \n"); 
			} else if(player2.getNumber() < hiddenNumber) {
				System.out.println("Your number is lower then the guessed one. \n__________ \n");
			} else if(player2.getNumber() == hiddenNumber) {
				System.out.println("\n" + player2.getName() + " HAS WON THE GAME! \nThe hidden number is: " + hiddenNumber);
				break;
			} else {
				System.out.println("WRONG VALUE. You've lost your turn.");
			}
		}
	} 
}
