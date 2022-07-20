package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.FlipKart;

public class FlipkartFactory {
	private static Properties props;
	static {
		System.out.println("Flipkart static block");
		try (FileInputStream fis = new FileInputStream("src/main/java/com/nt/commons/info.properties")) {
			props = new Properties();
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Factorry pattern
	public static FlipKart createFactory() throws Exception {
		// Target class object
		FlipKart fpkt = new FlipKart();
		// load dependednt class
		Class c = Class.forName(props.getProperty("dependent.comp"));
		// create object using reflection api
		Constructor cons[] = c.getDeclaredConstructors();
		Courier courier = (Courier) cons[0].newInstance();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
