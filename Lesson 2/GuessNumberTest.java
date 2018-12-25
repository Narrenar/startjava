import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER the First's player name:");
		Player player1 = new Player(scan.next(), 0);
		System.out.println("ENTER the Seconds's player name:");
		Player player2 = new Player(scan.next(), 0);
		GuessNumber game = new GuessNumber(player1.getName(), player1.getNumber(), player2.getName(), player2.getNumber());

		boolean programWork = true;
		while(programWork) {
			game.gameProces();

			char startAgain;
			do {
				System.out.println("Do you want to continue? [y/n]: ");
				startAgain = scan.next().charAt(0);	
				if (startAgain == 'y') {
					System.out.println("You've desided to continue playing. \n___________");
					continue;
				} else if(startAgain == 'n') {
					System.out.println("You've desided to stop playing.");
					programWork = false;
				} else {
					System.out.println("WRONG VALUE. Try again:");
				}
			} while (startAgain != 'y' && startAgain != 'n');
		}	
	}
}	

		/*Scanner scan = new Scanner(System.in);

		Player player1 = new Player(scan.next(), -1);
		Player player2 = new Player(scan.next(), -1);
		GuessNumber game = new GuessNumber((int)(Math.random()*100), true, "EMPTY NAME", 0);

		boolean programWork = true;
		while(programWork) {
			System.out.println("A new game has STARTED! \n");	
			System.out.println("Guess the hidden number from 0 to 100. \n__________ \n");

			while(game.getStartGame()) {
				System.out.println(player1.getName() + "'s guess is:");
				player1.setNumber(scan.nextInt());
				game.gameProces(player1.getName(), player1.getNumber(), game.getHiddenNumber());

				System.out.println(player2.getName() + "'s guess is:");
				player2.setNumber(scan.nextInt());
				game.gameProces(player2.getName(), player2.getNumber(), game.getHiddenNumber());
			}

			char startAgain;
			do {
				System.out.println("Do you want to continue? [y/n]: ");
				startAgain = scan.next().charAt(0);	
				if (startAgain == 'y') {
					System.out.println("You've desided to continue playing. \n___________");
					continue;
				} else if(startAgain == 'n') {
					System.out.println("You've desided to stop playing.");
					programWork = false;
				} else {
					System.out.println("WRONG SYMBOL. Try again:");
				}
			} while (startAgain != 'y' && startAgain != 'n');

			game.setHiddenNumber((int)(Math.random()*100));
			game.setStartGame(true);
		}*/


		/*System.out.println("Choose NAME for the FIRST player:");
		String player1Name = scan.next();
		System.out.println("Choose NAME for the SECOND player:");
		String player2Name = scan.next();*/

/*GuessNumber game = new GuessNumber(player1.getName(), player1.getNumber(), player2.getName(), player2.getNumber());*/