package com.java.stringclass;

public class Sample_String_Contains {

	public static void main(String[] args) {
		String str_Sample = "This is a String contains Example";
		// Check if String contains a sequence
		System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
		System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
		// String contains method is case sensitive
		System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
		System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));

		String str1 = "Java string contains If else Example";
		// In If-else statements you can use the contains() method

		if (str1.contains("example")) {
			System.out.println("\nThe Keyword :example: is found in given string");
		} else {
			System.out.println("\nThe Keyword :example: is not found in the string");
		}
	}

}
