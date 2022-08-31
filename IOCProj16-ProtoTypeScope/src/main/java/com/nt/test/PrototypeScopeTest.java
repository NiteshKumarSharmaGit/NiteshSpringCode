package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.ston.Printer;

public class PrototypeScopeTest {

	public static void main(String[] args) {
		// Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// Creating factory class object
		Printer p1 = factory.getBean("p1", Printer.class);
		Printer p2 = factory.getBean("p1", Printer.class);
		System.out.println("Printer1 hash code:" + p1.hashCode() + " " + "Printer2 hashcode" + p2.hashCode());
		System.out.println("Printer1==printer2:" + (p1 == p2));

	}

}
