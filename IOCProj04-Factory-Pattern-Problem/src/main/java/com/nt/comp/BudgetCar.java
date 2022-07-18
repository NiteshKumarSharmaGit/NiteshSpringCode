package com.nt.comp;

public class BudgetCar extends Car {
	private String regNo;

	public BudgetCar(String regNo) {
		this.regNo = regNo;
		System.out.println("Budget car::1-param constructor.......");
	}

	public void drive() {
		System.out.println("Budget car driver.........");
	}
}
