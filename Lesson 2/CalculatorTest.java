import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator1 = new Calculator();
		Scanner scan = new Scanner(System.in);

		System.out.println("Choose the FIRST number");
		calculator1.number1 = scan.nextInt ();
		System.out.println("Choose the math OPERATION");
		calculator1.mathSign = scan.next().charAt(0);
		System.out.println("Choose the SECOND number");
		calculator1.number2 = scan.nextInt();
		
		System.out.println("Answer: " + calculator1.mathSignCheck(0));
	}
}