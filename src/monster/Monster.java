package monster;

public class Monster {
	private String name;
	private String color;
	private int IrrirationValue;
	private int NumberOfEyes;
	
	public Monster(){
		
	}
	
	public Monster(String name, String color, int irrirationValue, int numberOfEyes) {
		super();
		this.name = name;
		this.color = color;
		IrrirationValue = irrirationValue;
		NumberOfEyes = numberOfEyes;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getIrrirationValue() {
		return IrrirationValue;
	}


	public void setIrrirationValue(int irrirationValue) {
		IrrirationValue = irrirationValue;
	}


	public int getNumberOfEyes() {
		return NumberOfEyes;
	}


	public void setNumberOfEyes(int numberOfEyes) {
		NumberOfEyes = numberOfEyes;
	}
	
}
