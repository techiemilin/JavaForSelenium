package com.java.firstproject;

public class MultiplicationTable {

	// 5*1=5
	// 5*10=50
	public void multiTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, (5 * i)).println();
		}

	}

	public void multiTable(int table) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", table, i, (table * i)).println();

		}
	}

	public void multiTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, (table * i)).println();

		}

	}
}