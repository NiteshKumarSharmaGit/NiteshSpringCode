package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipkartFactory {
	public static FlipKart createFlipkart(String courierType) {
		FlipKart fpkt = new FlipKart();
		Courier courier = null;
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid courier type...");
		fpkt.setCourier(courier);
		return fpkt;
	}
}
