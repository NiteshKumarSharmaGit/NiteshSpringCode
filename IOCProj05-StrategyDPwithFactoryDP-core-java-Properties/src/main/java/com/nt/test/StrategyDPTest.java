package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			FlipKart fpkt = FlipkartFactory.createFactory();
			String result = fpkt.shopping(new String[] { "Shirt", "Pant", "Trousers" },
					new float[] { 5000.0f, 6000.0f, 7000.0f });
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
