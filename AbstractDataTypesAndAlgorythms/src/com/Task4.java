package com;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		Integer[] arr1 = { 4, 7, 3, 9, 2 };
		Integer[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };

		Comparable[] uniqueElements = commonElements(arr1, arr2);
		
		for (Comparable element : uniqueElements) {
			System.out.print(element + " ");
		}
		
	}

	public static <T extends Comparable<T>> T[] commonElements(T[] arr1, T[] arr2) {
		LinkedHashSet<T> result = new LinkedHashSet();
		List<T> list1 = Arrays.asList(arr1);
		List<T> list2 = Arrays.asList(arr2);
		for (int i = 0; i < list1.size(); i++) {
			if (!list2.contains(list1.get(i))) {
				continue;
			}

			result.add(list1.get(i));
		}

		for (int i = 0; i < list2.size(); i++) {
			if (!list1.contains(list2.get(i))) {
				continue;
			}

			result.add(list2.get(i));
		}

		return (T[]) result.toArray(new Comparable[result.size()]);
	}

}

