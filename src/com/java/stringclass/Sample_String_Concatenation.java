package com.java.stringclass;

public class Sample_String_Concatenation {

	public static void main(String[] args) {
		// String Concatenation

		String str1 = "Lionel";
		String str2 = " Messi";

		// Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);

		// Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
	}
}
