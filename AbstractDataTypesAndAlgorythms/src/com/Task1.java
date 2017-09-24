package com;

import java.util.LinkedList;

public class Task1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> input = new LinkedList<>();
		input.add(10);
		input.add(16);
		input.add(9);
		input.add(5);
		input.add(21);
		reverseLinedList(input);
		
		for (Integer num : input) {
			System.out.print(num + " ");
		}
	}
	
	public static <T> void reverseLinedList(LinkedList<T> inputList) {
		for (int i = 0; i < inputList.size() / 2; i++) {
			T temp = inputList.get(i);
			inputList.set(i, inputList.get(inputList.size() - i - 1));
			inputList.set(inputList.size() - i - 1, temp);
		}
	}
}

