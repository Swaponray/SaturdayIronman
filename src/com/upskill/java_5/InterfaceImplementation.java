package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 Door");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has Dual Motor Engine");
		return "Dual Motor";
	}

	@Override
	public void iColor() {
		System.out.println("My Car is Red");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 Wheel");
		return 4;
	}

}
