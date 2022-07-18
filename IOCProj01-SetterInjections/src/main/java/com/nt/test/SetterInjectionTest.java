package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		// Hold spring bean cfg file and location
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		// create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		// get traget spring bean class object
		Object obj = factory.getBean("wmg");
		// typecasting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		// invoke business method
		String result = generator.generateMessage("Nitesh");
		System.out.println("Wish mesaage is::" + result);
	}// main
}// class
