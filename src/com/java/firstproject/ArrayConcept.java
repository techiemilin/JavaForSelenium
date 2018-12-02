package com.java.firstproject;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array: similar data type storage in a array variable

		// 1. int array:

		int j[] = new int[6];
		j[0] = 20;
		j[1] = 30;
		j[2] = 40;
		j[3] = 50;
		j[4] = 60;
		j[5] = 70;
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println(j[2]);
		System.out.println(j[3]);
		System.out.println(j[4]);

		System.out.println("************************");

		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
		}
		System.out.println("************************");

		double d[] = new double[4];

		d[0] = 10.00;
		d[1] = 20.00;
		d[2] = 30.00;
		d[3] = 40.00;

		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);

		System.out.println("************************");

		// for (int e = 0; e < d.length; e++) {
		// System.out.println(d[e]);

		for (int k = d.length - 1; k >= 0; k--) {
			System.out.println(d[k]);
		}
		System.out.println("************************");

		String family[] = new String[5];

		family[0] = "MaheshBhai";
		family[1] = "Manjulaben";
		family[2] = "Rima";
		family[3] = "Urvi";
		family[4] = "Vishal";

		System.out.println("We are " + family.length + " members in the family");
		for (int z = 0; z < family.length; z++) {
			System.out.println(family[z]);

		}

	}
}
