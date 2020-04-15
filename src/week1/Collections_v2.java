package week1;

import java.util.ArrayList;
import java.util.List;

public class Collections_v2 {

	
	int[] arrayAdd1to100() {
		int[] arrint = new int[100];
		for (int i = 0; i < 100; i++) {
			arrint[i] = i + 1;
		}
		return arrint;
	}

	
	public List<Integer> arrayAdd100to999() {
		List<Integer> listint = new ArrayList<Integer>();
		for (Integer i = 99; i <= 999; i++) {
			listint.add(i);
		}
		return listint;
	}

	
	void multiply10100999() {
		List<Integer> lister = this.arrayAdd100to999();
		lister.forEach(ele -> System.out.println(ele * 10));
		// return lister;
	}

}
