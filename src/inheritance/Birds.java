package inheritance;

public class Birds extends Animal {
	
	private String feathers;
	
	public Birds(int weight, int height, int lifespan, String feathers) {
		super(weight, height, lifespan);
		this.feathers = feathers;
	}

	public void laysEggs() {
		System.out.println("I lay eggs.");
	}
	
	public void noTeeth() {
		System.out.println("I have no teeth.");
	}
	
	
	
	

}
