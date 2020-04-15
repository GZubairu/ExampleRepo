package garage;

public class Motorcycle extends Vehicle {
	
	// Fields/Variables
	private int topSpeed;
	private int mileage;
	private int value;
	
	//Constructor
	public Motorcycle(String vehicleMake, String vehicleType, String colour, int topSpeed, int mileage, int value) {
		super(vehicleMake, vehicleType, colour);
		this.topSpeed = topSpeed;
		this.mileage = mileage;
		this.value = value;
	}
	
	//Methods
	public void wheelie() {
		System.out.println("SKRR SKRRRR!");
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
		return "Motorcycle [topSpeed=" + topSpeed + ", mileage=" + mileage + ", value=" + value + "]";
	}
	
	
	
	

}
