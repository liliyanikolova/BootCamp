package com;

import java.util.TreeSet;

public class Task5 {
	
	public static void main(String[] args) {
		Integer[] input = {2,3,6,6,8,9,10,10,10,12,12};
		String[] input2 = {"b", "b", "c", "b", "b", "b", "c", "a", };
		
		Comparable[] array = removeDuplicates(input);
		Comparable[] array2 = removeDuplicates(input2);
		
		for (Comparable val : array) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		for (Comparable val : array2) {
			System.out.print(val + " ");
		}
	}
	
	public static <T extends Comparable> T[] removeDuplicates(T[] elements) {
		TreeSet uniqueValues = new TreeSet<>();
		for (T i : elements) {
			uniqueValues.add(i);
		}
		
		T[] result = (T[]) uniqueValues.toArray(new Comparable[uniqueValues.size()]);
	
		return result;
	}
}
