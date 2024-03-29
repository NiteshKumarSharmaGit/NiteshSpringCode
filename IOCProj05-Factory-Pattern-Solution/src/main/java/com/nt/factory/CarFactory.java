package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;

public class CarFactory {
	public static Car createCar(String type, String regNo) {
		if (type.equalsIgnoreCase("sports"))
			return new SportsCar(regNo);
		else if (type.equalsIgnoreCase("luxory"))
			return new LuxoryCar(regNo);
		else if (type.equalsIgnoreCase("budget"))
			return new BudgetCar(regNo);
		else
			throw new IllegalArgumentException("Invalid car type");

	}
}
