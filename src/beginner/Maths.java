package beginner;

public class Maths {
	
	public static void main(String[] args) {
		
		Maths m = new Maths();
		System.out.println(m.div(3.0,6.0));
		
	}

	
	
	
	
	public int add(int a,int b) {
		int c = a + b;
		return c;
	}
	
	public int product(int a,int b) {
		int c = a * b;
		return c;
	}
	
	public int sub(int a,int b) {
		int c = a - b;
		return c;
	}
	
	public Double div(Double a,Double b) {
		Double c = a / b;
		return c;
	}
}
