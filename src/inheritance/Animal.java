package inheritance;

public class Animal {
	
	private int weight;
	private int height;
	private int lifespan;
	
	
	public Animal(int weight, int height, int lifespan) {
		this.weight = weight;
		this.height = height;
		this.lifespan = lifespan;
	}

	public void eats() {
		System.out.println("I am an animal that eats.");
	}
	
	public void sleeps() {
		System.out.println("I am an animal that sleeps.");
	}

}
