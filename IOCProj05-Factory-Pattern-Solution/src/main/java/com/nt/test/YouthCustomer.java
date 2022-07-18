package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class YouthCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("sports", "BR-22C-1990");
		car.drive();
		System.out.println("==================================");
	}

}
