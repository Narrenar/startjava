import java.util.Scanner;

public class JaegerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jaeger jaeger1 = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 3, 8, 9);
		Jaeger jaeger2 = new Jaeger("Tank", "The GodDamnTank", "Russia", 55.5f, 1.9f, 3, 5, 30);
		Jaeger jaeger3 = new Jaeger("Evangelion", "Eva 01", "Japan", 40f, 1.1f, 8, 40, 70); //Evangelion is anyway better then any Jaeger. 'Eva 01' is better then any Evangelion
		
//Отсюда начинается управление Егерем, которое не связанно с выполнение ДЗ
		String controlledJaegerName;
		boolean correctJaegerName = false;
		do {
			System.out.println("Which Jaeger do you want to control? Type the name of the Jaeger:\nMark-5 \nThe GodDamnTank \nEva 01");
			controlledJaegerName = scan.nextLine();
			switch(controlledJaegerName) {
				case "Mark-5":
					correctJaegerName = true;
					break;	
				case "The GodDamnTank":
					correctJaegerName = true;
					break;	
				case "Eva 01":
					correctJaegerName = true;
					break;	
				default:
					System.out.println("ERROR: Wrong Value. TRY AGAIN. \n__________");
					break;
			}
		} while (correctJaegerName != true);
		System.out.println("You are controlling " + controlledJaegerName + ".\n__________");

		System.out.println("TYPE 'help' TO SEE THE COMMANDS YOU HAVE.\n__________");
		String commandOfUser;
		boolean startControllingJaeger = true;
		do {
			System.out.println("CHOOSE A COMMAND FOR " + controlledJaegerName + ".");
			commandOfUser = scan.nextLine();

			switch(commandOfUser) {
				case "drift":
					jaeger1.drift();
					break;	
				case "forward":
					jaeger1.move(commandOfUser);
					break;	
				case "back":
					jaeger1.move(commandOfUser);
					break;	
				case "right":
					jaeger1.move(commandOfUser);
					break;	
				case "left":
					jaeger1.move(commandOfUser);
					break;	
				case "turnr":
					jaeger1.turn(commandOfUser);
					break;	
				case "turnl":
					jaeger1.turn(commandOfUser);
					break;	
				case "scan":
					jaeger1.scanKaiju();
					break;	
				case "cannon":
					jaeger1.useVortexCannon();
					break;	
				case "help":
					System.out.println("COMMANDS:\ndrift - to start/stop drift \nforward - to go forward \nback - to go back \nright - to go right \nleft - to go left \nturnr - to turn right \nturnl - to turn left \nscan - to scan Kaiju \ncannon - to use the Vortex cannon \nexit - to finish the program \n__________");
					break;
				case "exit":
					System.out.println("YOU HAVE DESIDED TO STOP THE PROGRAM. BYE. \n__________");
					startControllingJaeger = false;
					break;
				default:
					System.out.println("ERROR: Wrong Value. TRY AGAIN. \nTYPE 'help' TO SEE THE COMMANDS YOU HAVE.\n__________");
					break;		
			}
		} while(startControllingJaeger == true);
	}
}	