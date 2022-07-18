package com.nt.comp;

public class LuxoryCar extends Car {
	private String regNo;

	public LuxoryCar(String regNo) {
		System.out.println("Luxory car::1-param constructor");
		this.regNo = regNo;
	}

	public void drive() {
		System.out.println("Luxory car driving...........");
	}

}
