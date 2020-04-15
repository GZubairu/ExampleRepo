package garage;

public class Vehicle {
	
	// Fields/Variables
	private String VehicleMake;
	private String vehicleType;
	private String colour;

	// Constructor
	public Vehicle(String vehicleMake, String vehicleType, String colour) {
		this.VehicleMake = vehicleMake;
		this.vehicleType = vehicleType;
		this.colour = colour;
	}

	// Methods
	public void drive() {
		System.out.println(" goes vroom!");
	}

	public void brake() {
		System.out.println(" goes skrrr!");
	}

	//Getters and Setters
	public String getVehicleMake() {
		return VehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		VehicleMake = vehicleMake;
	}

	public String getvehicleType() {
		return vehicleType;
	}

	public void setvehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleMake=" + VehicleMake + ", vehicleType=" + vehicleType + ", colour=" + colour + "]";
	}
	
	

}
