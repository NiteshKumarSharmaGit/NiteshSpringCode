package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class FlipKart {
	// HAS a property
	private Courier courier;

	// FlipKart constructor
	public FlipKart() {
		System.out.println("Flipkart 0-param constructor.....");
	}

	// Setter method
	public void setCourier(Courier courier) {
		System.out.println("Courier setter method..............");
		this.courier = courier;
	}

	// B.L method
	public String shopping(String[] items, float[] prices) {
		float billAmt = 0.0f;
		// calculate billAmount
		for (int i = 0; i < items.length; ++i) {
			billAmt = billAmt + prices[i];
		}
		// generate order id
		int oid = new Random().nextInt(1000);
		String status = courier.deliver(oid);
		String finalMsg = Arrays.toString(items) + "are purchased with" + Arrays.toString(prices) + "the bill amount is"
				+ billAmt;
		return finalMsg + ":::" + status;
	}

}
