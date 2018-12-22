import java.util.Scanner;

public class GuessNumber {

	public Scanner scan = new Scanner(System.in);
	public Player player1 = new Player();
	public Player player2 = new Player();
	int hiddenNumber;

	public void game() {
		System.out.println("A new game has STARTED! \n");

		System.out.println("Fill in the FIRST'S PLAYER name:");
		player1.name = scan.next();
		System.out.println("Fill in the SECOND'S PLAYER name:");
		player2.name = scan.next();

		hiddenNumber = (int)(Math.random()*100);
		System.out.println("Guess the hidden number from 0 to 100. \n__________ \n");

		while (true) {
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
		System.out.println("The hidden number is: " + hiddenNumber);
	} 
}