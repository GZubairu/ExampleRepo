package beginner;

public class Results {

	public static void main(String[] args) {

		Results r = new Results();		
		System.out.println(r.method1(100,120,50));
		System.out.println(r.method2(100,120,50));
	}

	
	
	public String method1(int Physics, int Chemistry, int Biology) {
		int Total = (Physics + Chemistry + Biology);
		return "Physics: " + Physics + " Chemistry: " + Chemistry + " Biology: " + Biology + " Total: " + Total;
	}
	
	public String method2(int Physics, int Chemistry, int Biology) {
		int Total = (Physics + Chemistry + Biology);
		int Percentage = (Total * 100) / 450;
		
		if (Percentage >= 60) {
			return "Exam Percentage: " + Percentage + "% Pass";
		} else {
			return "Exam Percentage: " + Percentage + "% Fail";
		}
		
		
		
		
	}



	
	}
	
	
	


