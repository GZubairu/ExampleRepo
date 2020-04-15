package week1;

public class CheckString {

	public static void main(String[] args) {

		CheckString cs = new CheckString();
		System.out.println(cs.checkMatch("Hello"));
		System.out.println(cs.checkMatch("Hi"));

	}

	public boolean checkMatch(String str) {

		boolean bool = false;
		String str2 = "Hello";
		
		if (str == str2) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}

}
