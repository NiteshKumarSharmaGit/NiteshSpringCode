package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			FlipKart fpKart = FlipkartFactory.createFlipkart("dtdc");
			String result = fpKart.shopping(new String[] { "shirt", "pant", "lungi" },
					new Float[] { 3400.0f, 5000.0f, 6000.0f });
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
