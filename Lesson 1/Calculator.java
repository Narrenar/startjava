public class Calculator {
	public static void main(String[] args) {
		int firstNumber = 42;
		int secondNumber = 4;
		String mathSign = "^";

		if (mathSign == "+") {
			System.out.println(firstNumber + secondNumber);
		} else if (mathSign == "-") {
			System.out.println(firstNumber - secondNumber);
		} else if (mathSign == "*") {
			System.out.println(firstNumber * secondNumber);
		} else if (mathSign == "/") {
			System.out.println(firstNumber / secondNumber);
		} else if (mathSign == "^") {
			int firstNumberInitialCopy = firstNumber;
			for (int i = secondNumber; i >= 2; i--) {
				firstNumber = firstNumber * firstNumberInitialCopy;
			}
			System.out.println(firstNumber);
		} else if (mathSign == "%") {
			System.out.println(firstNumber % secondNumber);
		} else {
			System.out.println("Wrong value. The Calculator accepts only these symbols: +, -, *, /, ^, %, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
		}
	}
}