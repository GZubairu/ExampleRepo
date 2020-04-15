package garage;

public class Lorry extends Vehicle {
	
	// Fields/Variables
	private int gears;
	private int noOfWheels;
	
	//Constructor
	public Lorry(String vehicleMake, String vehicleType, String colour, int gears, int noOfWheels) {
		super(vehicleMake, vehicleType, colour);
		this.gears = gears;
		this.noOfWheels = noOfWheels;
	}
	
	//Methods
	public void slow() {
		System.out.println("I'm never in the fast lane...");
	}
	
	public void hazard() {
		System.out.println("I have many blind spots.");	
	}

	//Getters and Setters
	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	@Override
	public String toString() {
		return "Lorry [gears=" + gears + ", noOfWheels=" + noOfWheels + "]";
	}
	
	
	
	

}
