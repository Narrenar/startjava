import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		GuessNumber game1 = new GuessNumber();
		Scanner scan = new Scanner(System.in);

		boolean gameStarted = true;
		while (gameStarted == true) {
			game1.game();

			char startAgain;
				do {
					System.out.println("Do you want to continue? [y/n]: ");
					startAgain = scan.next().charAt(0);	
					if (startAgain == 'y') {
						System.out.println("You've desided to continue playing. \n___________");
						continue;
					} else if(startAgain == 'n') {
						System.out.println("You've desided to stop playing.");
						gameStarted = false;
					} else {
						System.out.println("WRONG SYMBOL. Try again:");
					}
				} while (startAgain != 'y' && startAgain != 'n');
		}	
	}
}	