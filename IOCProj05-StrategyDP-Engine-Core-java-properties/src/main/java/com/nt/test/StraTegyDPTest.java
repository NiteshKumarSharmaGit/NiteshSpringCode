package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StraTegyDPTest {

	public static void main(String[] args) {
		try {
			Vehicle vehicle = VehicleFactory.createFactory();
			String result = vehicle.buyVehicle(new String[] { "XUV", "BMW", "Tractor" },
					new float[] { 1000000.0f, 200000.0f, 300000.0f });
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
