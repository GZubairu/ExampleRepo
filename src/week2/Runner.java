package week2;

public class Runner {
	
	public static void main(String[] args) {
		
		Sum x = new Sum();
		x.sum1(10, 20); 
		x.sum1(10, 20, 30);
		x.sum1(10, 20, 30, 40);
		x.sum1(10, 20, 30, 40, 50);
		
		Son s = new Son();
		s.badJokes();
		
		Animal m = new Dog();
		m.sound();
		
		Interface i = new Demo();
		i.example1();
		i.example2();
				
	}

}
