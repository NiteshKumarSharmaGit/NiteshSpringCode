package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class FlipKart {
	// HAS-A property
	private Courier courier;

	public FlipKart() {
		System.out.println("FlipKart-0-param constructor..........");
	}

	// Setter method
	public void setCourier(Courier courier) {
		System.out.println("Courier setter method......");
		this.courier = courier;
	}

	public String shopping(String[] items, Float[] prices) {
		// calculate billAmount
		float billAmt = 0.0f;
		for (int i = 0; i < items.length; ++i) {
			billAmt = billAmt + prices[i];
		}
		// generate order id
		int oid = new Random().nextInt(10000);
		String status = courier.deliver(oid);
		String finalMsg = Arrays.toString(items) + "are purchased with prices" + Arrays.toString(prices)
				+ ".The bill amount is" + billAmt;
		return finalMsg + ":::" + status;

	}
}
