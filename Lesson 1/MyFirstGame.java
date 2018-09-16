public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 42;
		int usersChoise = -1;

		do {
			usersChoise += 1;

			if (usersChoise > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if (usersChoise < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else if (usersChoise == hiddenNumber) {
				System.out.println("Вы угадали!" + hiddenNumber);
			} else {
				System.out.println("You have chosen the wrong value!");
			}
		} 
		while (usersChoise != hiddenNumber);
	}
}