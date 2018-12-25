import java.util.Scanner;

public class GuessNumber {

	Scanner scan = new Scanner(System.in);
	private int hiddenNumber;
	private boolean startGame;
	Player player1 = new Player("", 0);
	Player player2 = new Player("", 0);

	public GuessNumber(String player1Name, int player1Number, String player2Name, int player2Number) {
		this.hiddenNumber = hiddenNumber;
		this.startGame = startGame;
		player1.setName(player1Name);
		player1.setNumber(player1Number);
		player2.setName(player2Name);
		player2.setNumber(player2Number);
	}

	public void gameProces() {
		System.out.println("\nA new game has STARTED! \n");	
		System.out.println("Guess the hidden number from 0 to 100. \n__________ \n");	
		hiddenNumber = (int)(Math.random()*100);

		startGame = true;
		while(startGame) {
			System.out.println(player1.getName() + "'s guess is:");
			player1.setNumber(scan.nextInt());
			if(player1.getNumber() > hiddenNumber) {
				System.out.println("Your number is bigger then the guessed one. \n__________ \n");
			} else if(player1.getNumber() < hiddenNumber) {
				System.out.println("Your number is lower then the guessed one. \n__________ \n");
			} else if(player1.getNumber() == hiddenNumber) {
				System.out.println(player1.getName() + " HAS WON THE GAME! \nThe hidden number is: " + hiddenNumber);
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
				System.out.println(player2.getName() + " HAS WON THE GAME! \nThe hidden number is: " + hiddenNumber);
				break;
			} else {
				System.out.println("WRONG VALUE. You've lost your turn.");
			}
		}
	} 
}


	/*Player player1 = new Player(player1Name, player1Number);
	Player player2 = new Player(player2Name, player2Number);*/

/*public class GuessNumber {

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
	} */

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