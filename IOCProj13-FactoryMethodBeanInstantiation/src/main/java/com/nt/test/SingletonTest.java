package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SingletonTest {

	public static void main(String[] args) {
		// Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get spring bean class object
		Class clazz = factory.getBean("c1", Class.class);
		System.out.println("Clazz obj class name:" + clazz.getClass() + "clazz obj data:" + clazz.toString());
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		Calendar cal = factory.getBean("cal", Calendar.class);
		System.out.println("Calendar obj class name:" + cal.getClass() + "Calendar object data:" + cal.toString());
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");

		Properties props = factory.getBean("props", Properties.class);
		System.out.println("Properties obj class: " + props.getClass() + "properties object data:" + props.toString());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");

		String s2 = factory.getBean("s1", String.class);
		System.out.println("String obj class name:" + s2.getClass() + "string object data:" + s2);
		System.out.println(
				"------------------------------------------------------------------------------------------------");

		String s3 = factory.getBean("s3", String.class);
		System.out.println("String obj class name:" + s3.getClass() + "string object data:" + s3);

	}

}
