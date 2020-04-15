package garage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> CarGarage = new ArrayList<Vehicle>();
	
	public boolean addVehicle(Vehicle vehicle) {
		return CarGarage.add(vehicle);
	}
	
	public void printVehicles() {
		for (Vehicle v:CarGarage) {
			System.out.println(v);
		}
	}
	

}
