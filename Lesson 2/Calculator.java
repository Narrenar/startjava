public class Calculator {

	public float number1, number2;
	public char mathSign; 

	public Float calculate() {
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
					float result = 1;
					for (float i = number2; i > 0; i--) {
						result *= number1;
					}
				return result;
			case '%': 
				return number1 % number2;
		}
		return null;
	} 
}
 