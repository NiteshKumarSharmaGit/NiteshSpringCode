package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.ston.Printer;

public class PrototypeScopeTest {

	public static void main(String[] args) {
		// IOC container creation
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// factory bean object creation
		Printer p1 = factory.getBean("p1", Printer.class);
		Printer p2 = factory.getBean("p1", Printer.class);
		System.out.println("Printer1 hashcode:" + p1.hashCode() + "printer2 hashcode:" + p2.hashCode());
		System.out.println("printer1==printeer2" + (p1 == p2));
		System.out.println("============================================");

	}

}
