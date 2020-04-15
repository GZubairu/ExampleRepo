package week1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Streams {
	
	public void oneToHundred() {
		int [] nums = new int[100];
		
		IntStream.range(0, nums.length).forEach(i -> nums[i] = i + 1);
	}
	
	public ArrayList<Integer> numToList() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		IntStream.range(100, 1000).forEach(i -> numbers.add(i));
		return numbers;
	}
	
	public void listIterate(ArrayList<Integer> a) {
		a.stream()
		.map(i -> i * 10)
		.forEach(System.out::println);
	}

}
