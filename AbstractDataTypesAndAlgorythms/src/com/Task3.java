package com;

public class Task3 {
	
	public static void main(String[] args) {
		System.out.println(reverseString("abcde"));
	}
	
	public static String reverseString(String inputText) {
		
		if(inputText.length() == 0) {
			return "";
		}		
		
		String result = inputText.substring(inputText.length() - 1, inputText.length()) + reverseString(inputText.substring(0, inputText.length() - 1));
		
		 return result;
	}
}

