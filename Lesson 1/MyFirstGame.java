public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 42;
		int usersGuess = 100;

		do {
			if (usersGuess > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				usersGuess -= 1;
			} else if (usersGuess < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				usersGuess += 1;
			} else if (usersGuess == hiddenNumber) {
				System.out.println("Вы угадали!");
			} else {
				System.out.println("You have chosen the wrong value (like #)! You can use only Figures and Numbers with these symbols: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
			}
		} 
		while (usersGuess != hiddenNumber);
		System.out.println("Загаданное число: " + 42);
	}
}