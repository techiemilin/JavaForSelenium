package com.java.firstproject;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Abschdjjdjdj!@^#%$&$($&#^#%#&$*$*#&#^1234459676AASJFDHDGDDJJDJDDJDJDJJ";
		s = s.replaceAll("[^ a-z A-Z 0-9 ]", "");
		System.out.println(s);

	}

}
