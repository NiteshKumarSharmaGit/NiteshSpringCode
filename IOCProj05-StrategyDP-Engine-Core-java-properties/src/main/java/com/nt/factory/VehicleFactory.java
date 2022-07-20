package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Engine;
import com.nt.comp.Vehicle;

public class VehicleFactory {
	// HAS-A property
	private static Properties props;
	// static block
	static {
		System.out.println("vehicle Gactory static  block.......");
		try (FileInputStream fis = new FileInputStream("src/main/java/com/nt/commons/info.properties")) {
			props = new Properties();
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// factory pattern
	public static Vehicle createFactory() throws Exception {
		// target class object
		Vehicle vehicle = new Vehicle();
		// load dependent class
		Class c = Class.forName(props.getProperty("dependent.comp"));
		// create object using reflection API
		Constructor cons[] = c.getDeclaredConstructors();
		Engine engine = (Engine) cons[0].newInstance();
		vehicle.setEngine(engine);
		return vehicle;

	}

}
