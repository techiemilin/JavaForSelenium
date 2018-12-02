package com.java.abstactclass;

public abstract class Bank {

	int amount = 100; // non static
	final int min_bal = 200;// final keyword
	static int monthly_fees = 20;// static

	// in abstract class

	public abstract void loan(); // abstract method

	// Non abstract method
	// can not create abstract class object or interface

	public void credit() {
		System.out.println("Credit-----Bank");
	}

	public void debit() {
		System.out.println("Debit------Bank");

	}

}
