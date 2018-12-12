/* 
Только ввычисляет
*/
public class Calculator {

public int number1, number2;
public char mathSign; 

	public int mathSignCheck(int result) {
		switch(mathSign) {
		case '+': 
			return result = number1 + number2;
		case '-': 
			return result = number1 - number2;
		case '*': 
			return result = number1 * number2;
		case '/': 
			return result = number1 / number2;
		case '^': 
			int number1InitialCopy = number1;
			for (int i = number2; i >= 2; i--) {
				number1 *= number1InitialCopy;
			}
			return result = number1;
		case '%': 
			return result = number1 % number2;
		}
		return 0;
	}
}

/*public int nubemr1, number2;
public char mathSign; 

	public int mathSignCheck(result) {
		switch(mathSign) {
		case '+': 
			System.out.println(number1 + number2);
			break;
		case '-': 
			System.out.println(number1 - number2);
			break;
		case '*': 
			System.out.println(number1 * number2);
			break;
		case '/': 
			System.out.println(number1 / number2);
			break;
		case '^': 
			int number1InitialCopy = number1;
			for (int i = number2; i >= 2; i--) {
				number1 *= number1InitialCopy;
			}
			System.out.println(number1);
			break;
		case '%': 
			System.out.println(number1 % number2);
			break;
		}
		return 0;
	}
}*/

/*	int result;
	public int mathSignCheck() {
		switch(mathSign) {
		case "+": 
			return number1 + number2;
			break;
		case "-": 
			return number1 - number2;
			break;
		case "*": 
			return number1 * number2;
			break;
		case "/": 
			return number1 / number2;
			break;
		case "^": 
			int number1InitialCopy = number1;
			for (int i = number2; i >= 2; i--) {
				number1 *= number1InitialCopy;
			}
			result = number1; //почистить здесь код
			return result;
			break;
		case "%": 
			return number1 % number2;
			break;
		}
		return 0;
	}
}*/
