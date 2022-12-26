package test;

import java.util.Arrays;

public class ValueComareExample {

	public static void main(String[] args) {
		
		int[] numbers = { 1, 42, 9, 8, 2, 33 };
		System.out.println(Arrays.toString(numbers));
		
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 8));
		
	}
	

}
