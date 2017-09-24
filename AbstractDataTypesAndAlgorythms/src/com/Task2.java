package com;

public class Task2 {
	
	public static void main(String[] args) {
		int[] input = new int[]{2, 3, 7, 1, 2, 2};
		int medianIndex = findMedianIndex(input);
		System.out.println(medianIndex);
	}
	
	public static int findMedianIndex(int[] input) {
		int preceededNumbersSum = 0;		
		
		for (int i = 0; i < input.length - 2; i++) {
			preceededNumbersSum += input[i];
			int succeededNumberSum = 0;
			for (int j = i + 2; j < input.length; j++) {
				succeededNumberSum += input[j];
			}
			
			if(preceededNumbersSum == succeededNumberSum) {
				return i + 1;
			}
		}
		
		return - 1;
		
	}

}

