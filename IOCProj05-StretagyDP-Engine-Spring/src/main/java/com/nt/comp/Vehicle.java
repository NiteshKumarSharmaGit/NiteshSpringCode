package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Vehicle {
	// HAS a property
	private Engine engine;

	// constructor
	public Vehicle() {
		System.out.println("Vehicle 0-param construcot...........");
	}

	// setter method
	public void setEngine(Engine engine) {
		System.out.println("Engine setter method........");
		this.engine=engine;
	}

	// Business method
	public String buyVehicle(String[] items, float[] prices) {
		float billAmt = 0.0f;
		// calculate billAmount
		for (int i = 0; i < items.length; ++i) {
			billAmt = billAmt + prices[i];
		}
		int eno = new Random().nextInt(1000);
		String status = engine.start(eno);
		String resultMsg = Arrays.toString(items) + "are purchesed with" + Arrays.toString(prices) + "bill amount is"
				+ billAmt;
		return resultMsg + status;
	}

}
