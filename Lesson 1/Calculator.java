public class Calculator {
	public static void main(String[] args) {
		double firstNumber = 42;
		double secondNumber = 1;
		double result = 0;
		String usersChoise = "^";

		if (usersChoise == "+") {
			result = firstNumber + secondNumber;
			System.out.println(result);
		} else if (usersChoise == "-"){
			result = firstNumber - secondNumber;
			System.out.println(result);
		} else if (usersChoise == "*"){
			result = firstNumber * secondNumber;
			System.out.println(result);
		} else if (usersChoise == "/"){
			result = firstNumber / secondNumber;
			System.out.println(result);
		} else if (usersChoise == "^"){
			result = java.lang.Math.pow(firstNumber, secondNumber);
			System.out.println(result);
		} else if (usersChoise == "%"){
			result = firstNumber % secondNumber;
			System.out.println(result);
		} else {
			System.out.println("Wrong value");
		}
	}
}