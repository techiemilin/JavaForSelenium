package com.java.stringclass;

public class Sample_String_IndexOf {

	public static void main(String args[]) {

		String str_Sample = "Lionel Messi is Great Player of the World";
		// Character at position
		System.out.println("Index of character 'x': " + str_Sample.indexOf('e'));
		// Character at position after given index value
		System.out.println("Index of character 's' after 3 index: " + str_Sample.indexOf('s', 3));
		// Give index position for the given substring
		System.out.println("Index of substring 'is': " + str_Sample.indexOf("is"));
		// Give index position for the given substring and start index
		System.out.println("Index of substring 'is' form index:" + str_Sample.indexOf("is", 1));
	}
}
