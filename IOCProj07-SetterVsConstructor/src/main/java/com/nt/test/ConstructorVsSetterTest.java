package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Customer;
import com.nt.beans.Employee1;
import com.nt.beans.Student;

public class ConstructorVsSetterTest {

	public static void main(String[] args) {
		// Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// load xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// create object of dependent class
		Employee1 result = factory.getBean("emp1", Employee1.class);
		System.out.println(result);
		System.out.println("=============================");
		Student stud = factory.getBean("stud1", Student.class);
		System.out.println(stud);
		System.out.println("+++++++++++++++++++++++");
		Customer customer = factory.getBean("cust1", Customer.class);
		System.out.println(customer);
	}

}
