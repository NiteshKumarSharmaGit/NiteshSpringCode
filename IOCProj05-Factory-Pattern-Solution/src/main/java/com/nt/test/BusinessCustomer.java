package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class BusinessCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("luxory", "BR-22C-1909");
		car.drive();
		System.out.println("======================");

	}

}
