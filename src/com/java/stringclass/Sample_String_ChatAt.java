package com.java.stringclass;

public class Sample_String_ChatAt {

	public static void main(String args[]) {
		String s1 = "This is String CharAt Method";
		// returns the char value at the 0 index
		System.out.println("Character at 0 position is: " + s1.charAt(0));
		// returns the char value at the 5th index
		System.out.println("Character at 5th position is: " + s1.charAt(5));
		// returns the char value at the 22nd index
		System.out.println("Character at 22nd position is: " + s1.charAt(22));
		// returns the char value at the 23th index
		char result = s1.charAt(-1);
		System.out.println("Character at 23th position is: " + result);
	}
}

/*
 * This Java method takes an argument which is always int type. This method
 * returns the character as char for the given int argument. The int value
 * specifies the index that starts at 0. If the index value is higher than
 * string length or a negative, then IndexOutOfBounds Exception error occurs.
 * The index range must be between 0 to string_length-1.
 */