package com.nt.comp;

public class BudgetCar extends Car {
	private String regNo;

	public BudgetCar(String regNo) {
		System.out.println("Budgtcar-1-param-construtor..........");
		this.regNo = regNo;
	}

	public void drive() {
		System.out.println("Budget car driving............");
	}
}
