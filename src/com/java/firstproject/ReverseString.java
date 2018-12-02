package com.java.firstproject;

public class ReverseString {

	public static void main(String[] args) {

		// 1.
		String r = "Selenium";

		StringBuffer s = new StringBuffer(r);

		System.out.println(s.reverse());

		// 2.
		int len = r.length();

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + r.charAt(i);

		}

		System.out.println(rev);

	}
}
