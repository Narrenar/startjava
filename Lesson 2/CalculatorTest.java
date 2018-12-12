/*
1. Определить математическую оперецию, вводимые пользователем
2. Определяет первое и второе число, вводимое пользователем
*/

/*
Scaner scan = new Scanner(System.in);

		int number1 = scan.int();
		String mathSign = scan.next();
		int number2 = scan.int();
*/
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

	/*	System.out.println("Choose the FIRST number");
		int number1 = scan.nextInt ();
		System.out.println("Choose the math OPERATION ");
		String mathSign = scan.next();
		System.out.println("Choose the SECOND number");
		int number2 = scan.nextInt();*/

		// Нужно использовать Calculator, чтобы вычислить знанения из инпутов
		/*System.out.println(number1);
		System.out.println(number2);
		System.out.println(mathSign);*/
