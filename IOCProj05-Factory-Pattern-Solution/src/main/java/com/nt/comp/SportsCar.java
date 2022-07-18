package com.nt.comp;

public class SportsCar  extends Car{
	private String regNo;

	public SportsCar(String regNo) {
		System.out.println("SportsCar-1-param constructor...");
		this.regNo = regNo;
	}

	public void drive() {
		System.out.println("Sportscar driving..............");
	}
}
