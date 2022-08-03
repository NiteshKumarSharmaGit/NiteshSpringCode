package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	// Has a property
	private Courier courier;

	// constructor
	public Flipkart() {
		System.out.println("0-param flipkart constrcuotor.........");
	}

	// setter method
	public void setCourier(Courier courier) {
		System.out.println("Courier-setter method.......");
		this.courier = courier;
	}

	// B.L method
	public String shopping(String[] items, float[] prices) {
		float billAmt = 0.0f;
		// calculate bill amount
		for (int i = 0; i < items.length; ++i) {
			billAmt = billAmt + prices[i];
		}
		// generate order id
		int oid = new Random().nextInt(10000);
		String status = courier.deliver(oid);
		String finalMsg = Arrays.toString(items) + "are purchased with" + Arrays.toString(prices) + "with the amount"
				+ billAmt;
		return finalMsg + ":::" + status;

	}
}
