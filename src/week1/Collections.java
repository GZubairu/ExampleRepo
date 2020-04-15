package week1;

import java.util.ArrayList;

public class Collections {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> cent = new ArrayList<>(100);
		ArrayList<Integer> millen = new ArrayList<>(900);
		ArrayList<Integer> cent2 = new ArrayList<>(100);
		ArrayList<Integer> millen2 = new ArrayList<>(900);
	 
		
		for (int i = 1; i <= 100; ++i) {
			cent.add(i);
		}
		for (int i = 100; i<= 999; ++i) {
			millen.add(i);
		}
		for (int i = 1; i <= 100; ++i) {
			cent2.add(i*10);
		}
		for (int i = 100; i<= 999; ++i) {
			millen2.add(i*10);
		}
		
		
		System.out.println(cent);
		System.out.println(millen);
		System.out.println(cent2);
		System.out.println(millen2);
		
		
	}
	
	

}
