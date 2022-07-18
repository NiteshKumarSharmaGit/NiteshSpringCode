package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class ProfessionalCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("budget", "BR-22C-8989");
		car.drive();
		System.out.println("==========================");

	}

}
