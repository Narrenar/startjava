public class Calculator {

public float number1, number2;
public char mathSign; 

	public float calculating() {
		switch(mathSign) {
		case '+': 
			return number1 + number2;
		case '-': 
			return number1 - number2;
		case '*': 
			return number1 * number2;
		case '/': 
			return number1 / number2;
		case '^': 
			if (number2 != 0) {
				float number1InitialCopy = number1;
				for (float i = number2; i >= 2; i--) {
					number1 *= number1InitialCopy;
				}
			return number1;
			} else {
			return 1;
			}
		case '%': 
			return number1 % number2;
		}
		return 0;
	} 
}
 