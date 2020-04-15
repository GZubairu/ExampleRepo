package week1;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(50,25));
		System.out.println(calc.sub(50,25));
		System.out.println(calc.mult(50,25));
		System.out.println(calc.div(50,25));
	}
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public int sub(int a, int b) {
		int c = a-b;
		return c;
	}
	public int mult(int a, int b) {
		int c = a*b;
		return c;
	}
	public int div(int a, int b) {
		int c = a/b;
		return c;
	}




}
