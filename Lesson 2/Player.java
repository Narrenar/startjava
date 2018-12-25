public class Player {

	private String name;
	private int number;

	public Player(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public int setNumber(int number) {
		this.number = number;
		return number;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}
}