import java.util.Scanner;

public class GuessNumber {

	private int hiddenNumber, playerNumber;
	private String playerName;
	private boolean startGame;

	public GuessNumber(int hiddenNumber, boolean startGame, String playerName, int playerNumber) {
		this.hiddenNumber = hiddenNumber;
		this.startGame = startGame;
		this.playerName = playerName;
		this.playerNumber = playerNumber;
	}

	public int setHiddenNumber(int hiddenNumber) {
		this.hiddenNumber = hiddenNumber;
		return hiddenNumber;
	}

	public int getHiddenNumber() {
		return hiddenNumber;
	}

	public boolean setStartGame(boolean startGame) {
		this.startGame = startGame;
		return startGame;
	}

	public boolean getStartGame() {
		return startGame;
	}

	public void gameProces(String playerName, int playerNumber, int hiddenNumber) {
		this.playerName = playerName;
		this.playerNumber = playerNumber;

		if(playerNumber > hiddenNumber) {
			System.out.println("Your number is bigger then the guessed one. \n__________ \n");
		} else if(playerNumber < hiddenNumber) {
			System.out.println("Your number is lower then the guessed one. \n__________ \n");
		} else if(playerNumber == hiddenNumber) {
			System.out.println(playerName + " HAS WON THE GAME! \nThe hidden number is: " + hiddenNumber);
			startGame = false;
		}		
	} 
}

/*	public GuessNumber(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player1Number = player1Number;
		this.player2Name = player2Name;
		this.player2Number = player2Number;
	}*/

/*		while (true) {
			System.out.println(player1.name + "'s guess is:");
			player1.number = scan.nextInt();
			if (player1.number > hiddenNumber) {
				System.out.println("Your number is bigger then the guessed one. \n__________ \n");
			} else if (player1.number < hiddenNumber) {
				System.out.println("Your number is lower then the guessed one. \n__________ \n");
			} else if (player1.number == hiddenNumber) {
				System.out.println(player1.name + " HAS WON THE GAME!");
				break;
			}

			System.out.println(player2.name + "'s guess is:");
			player2.number = scan.nextInt();
			if (player2.number > hiddenNumber) {
				System.out.println("Your number is bigger then the guessed one. \n__________ \n");
			} else if (player2.number < hiddenNumber) {
				System.out.println("Your number is lower then the guessed one. \n__________ \n");
			} else if (player2.number == hiddenNumber) {
				System.out.println(player2.name + " HAS WON THE GAME!");
				break;
			}
		}
		System.out.println("The hidden number is: " + hiddenNumber);*/