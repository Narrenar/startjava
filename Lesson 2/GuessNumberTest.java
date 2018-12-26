import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nENTER the First's player name:");
		Player player1 = new Player(scan.next());
		System.out.println("\nENTER the Seconds's player name:");
		Player player2 = new Player(scan.next());
		GuessNumber game = new GuessNumber(player1, player2);

		boolean programWork = true;
		while(programWork) {
			game.gameProces();

			char startAgain;
			do {
				System.out.println("\nDo you want to continue? [y/n]: ");
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

		