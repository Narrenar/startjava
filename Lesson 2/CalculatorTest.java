import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator1 = new Calculator();
		Scanner scan = new Scanner(System.in);
		Boolean startCalculator = true;
	
		while (startCalculator == true) {
			System.out.println("Choose the FIRST number:");	 
			calculator1.number1 = scan.nextFloat();
			System.out.println("Choose the math OPERATION:");
			calculator1.mathSign = scan.next().charAt(0);
			System.out.println("Choose the SECOND number:");
			calculator1.number2 = scan.nextFloat();
			
			System.out.println("Answer: " + calculator1.calculating());

			char startAgain;
			do {
				System.out.println("Do you want to continue? [y/n]: ");
				startAgain = scan.next().charAt(0);	
				if (startAgain == 'y') {
					System.out.println("You've desided to continue calculating. \n___________");
					continue;
				} else if(startAgain == 'n') {
					System.out.println("You've desided to stop calculating.");
					startCalculator = false;
				} else {
					System.out.println("WRONG SYMBOL. Try again:");
				}
			} while (startAgain != 'y' && startAgain != 'n');
		}	
	}
}
