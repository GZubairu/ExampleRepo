package garage;

public class Runner {
	
	public static void main(String[] args) {
		
//		Vehicle merc = new Vehicle("Mercedes", "Auto", "Black");
//		System.out.println(merc.getvehicleType());
//		System.out.println(merc.getColour());
//		merc.setColour("Red");
//		System.out.println(merc.getColour());
//		System.out.println(merc.toString());
//		merc.brake();
		
		
		Car CLA = new Car("Mercedes", "Auto", "Black", 180, 50000, 20000);
//		System.out.println(CLA.toString());
//		System.out.println(CLA.getVehicleMake());
//		CLA.brake();
		
		
		Garage g = new Garage();
		
		g.addVehicle(CLA);
		g.printVehicles();
		
	}

}
