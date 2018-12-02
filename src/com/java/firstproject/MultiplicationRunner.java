package com.java.firstproject;

public class MultiplicationRunner {

	public static void main(String[] args) {
		MultiplicationTable MT = new MultiplicationTable();
		MT.multiTable();
		MT.multiTable(19);
		MT.multiTable(20, 1, 19);

		RefactoringMultiplicationTable RMT = new RefactoringMultiplicationTable();
		RMT.multiTable();
		RMT.multiTable(6);
		RMT.multiTable(10, 1, 10);

	}

}
