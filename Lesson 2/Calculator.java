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