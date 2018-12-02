package com.java.abstactclass;

public class BMW implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start------BMW");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop-------BMW");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Refuel--------BMW");
	}

	public void theftSafety() {
		System.out.println("Theft Safety --------BMW");
	}

}
