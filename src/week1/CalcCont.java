package week1;

public class CalcCont {


	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int mult(int a, int b) {
		int c = a * b;
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		return c;
	}
	
	public void CC(int a, int b, String c) {
		switch(c) {
		case "add":
			System.out.println(add(a,b));
			break;
		case "sub":
			System.out.println(sub(a,b));
			break;
		case "mult":
			System.out.println(mult(a,b));
			break;
		case "div":
			System.out.println(div(a,b));
			break;
		default:
			System.out.println("BYE!");
			break;
		}
		
	}
}
