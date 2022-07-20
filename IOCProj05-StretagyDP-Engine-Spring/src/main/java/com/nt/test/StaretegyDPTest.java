package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Vehicle;

public class StaretegyDPTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		Vehicle vehicle = factory.getBean("vehicle", Vehicle.class);
		String resultMsg = vehicle.buyVehicle(new String[] { "XUV", "TUV", "JAGUAR" },
				new float[] { 10000.0f, 20000.0f, 3000.0f });
		System.out.println(resultMsg);

	}

}
