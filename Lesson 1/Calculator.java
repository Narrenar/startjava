public class Calculator {
	public static void main(String[] args) {
		int firstNumber = 42;
		int secondNumber = 3;
		String usersMathAction = "^";

		if (usersMathAction == "+") {
			System.out.println(firstNumber + secondNumber);
		} else if (usersMathAction == "-") {
			System.out.println(firstNumber - secondNumber);
		} else if (usersMathAction == "*") {
			System.out.println(firstNumber * secondNumber);
		} else if (usersMathAction == "/") {
			System.out.println(firstNumber / secondNumber);
		} else if (usersMathAction == "^") {
			for (int i = secondNumber; i >= 1; i--) {
				firstNumber = firstNumber * firstNumber;
			}
			System.out.println(firstNumber);
		} else if (usersMathAction == "%") {
			System.out.println(firstNumber % secondNumber);
		} else {
			System.out.println("Wrong value. The Calculator accepts only this symbols: +, -, *, /, ^, %, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
		}
	}
}