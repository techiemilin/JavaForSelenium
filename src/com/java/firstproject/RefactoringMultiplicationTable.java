package com.java.firstproject;

public class RefactoringMultiplicationTable {

	public void multiTable() {

		multiTable(5);

	}

	public void multiTable(int table) {
		multiTable(table, 1, 10);

	}

	public void multiTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, (table * i)).println();

		}

	}

}
