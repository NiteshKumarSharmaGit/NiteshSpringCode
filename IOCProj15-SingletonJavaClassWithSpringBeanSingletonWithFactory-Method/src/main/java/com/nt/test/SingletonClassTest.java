package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.ston.Printer;

public class SingletonClassTest {

	public static void main(String[] args) {
		// Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// Spring bean class object
		Printer printer1 = factory.getBean("p1", Printer.class);
		Printer printer2 = factory.getBean("p1", Printer.class);
		System.out.println("Printer1 hashcode:" + printer1.hashCode() + " " + "printer2 hashcode:" + printer2.hashCode());
		System.out.println("printer1==printer2:" + (printer1 == printer2));
		System.out.println("========================================");
		Printer printer3=factory.getBean("p",Printer.class);
		Printer printer4=factory.getBean("p",Printer.class);
		System.out.println("Printer3 hashcode:"+printer3.hashCode()+" "+"printer4 hashcode:"+printer4.hashCode());
		System.out.println("printer3==printer4"+(printer3==printer4));

	}

}
