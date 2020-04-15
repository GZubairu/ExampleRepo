package inheritance;

public class Mammal extends Animal {
	

	private String hair;
	private int legNumber;
	
	
	public Mammal(int weight, int height, int lifespan, String hair, int legNumber) {
		super(weight, height, lifespan);
		this.hair = hair;
		this.legNumber = legNumber;
	}

	public void liveBirth() {
		System.out.println("My young are born alive.");
	}
	
	public void feeding() {
		System.out.println("My young feed off my milk glands.");
	}
	

}
