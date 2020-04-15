package garage;

public class Car extends Vehicle {
	
	// Fields/Variables
	private int topSpeed;
	private int mileage;
	private int value;
	
	//Constructor
	public Car(String vehicleMake, String vehicleType, String colour, int topSpeed, int mileage, int value) {
		super(vehicleMake, vehicleType, colour);
		this.topSpeed = topSpeed;
		this.mileage = mileage;
		this.value = value;
	}
	
	//Methods 
	public void cruise() {
		System.out.println("Cruise control");
	}
	
	public void heatedSeat() {
		System.out.println("My seats are getting hot!");
	}

	//Getters and Setters
	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Car [topSpeed=" + topSpeed + ", mileage=" + mileage + ", value=" + value + "]";
	}
	
	
	
	
	
	
	

}
