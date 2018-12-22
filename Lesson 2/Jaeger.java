public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	
	public Jaeger(String modelNameConstructor, String markConstructor, String originConstructor, float heightConstructor, float weightConstructor, int speedConstructor, int strengthConstructor, int armorConstructor) {
	modelName = modelNameConstructor;
	mark = markConstructor;
	origin = originConstructor;
	height = heightConstructor;
	weight = weightConstructor;
	speed = speedConstructor;
	strength = strengthConstructor;
	armor = armorConstructor;
	}
	
	boolean startDrift = true;
	boolean drift() {
		if(startDrift == true) {
		System.out.println("- Drift ON! \n__________");
		startDrift = false;
		} else {
		System.out.println("- Drift OFF! \n__________");
		startDrift = true;
		}
		return true;
	}

	void move(String directionOfMovement) {
		if (directionOfMovement.equals("forward")) { 
			System.out.println("- You've MOVED Forward. \n__________");
		} else if(directionOfMovement.equals("back")) { 
		System.out.println("- You've MOVED back. \n__________");
		} else if(directionOfMovement.equals("right")) { 
			System.out.println("- You've MOVED right. \n__________");
		} else if(directionOfMovement.equals("left")) { 
			System.out.println("- You've MOVED left. \n__________");
		} 
	}

	void turn(String directionOfTurning) {
		if(directionOfTurning.equals("turnr")) { 
			System.out.println("- You've TURNED right. \n__________");
		} else if(directionOfTurning.equals("turnl")) { 
			System.out.println("- You've TURNED left. \n__________");
		}
	}

	void scanKaiju() {
		System.out.println("- No Kaiju is detected. \n__________");
	}

	void useVortexCannon() {
		System.out.println("- A SHOT from the Vortex cannon was done. \n- Congrats! You've killed nothing. \n__________");
	}
}