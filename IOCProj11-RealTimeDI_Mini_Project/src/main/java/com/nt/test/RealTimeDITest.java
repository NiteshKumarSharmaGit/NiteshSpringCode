package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest {
	public static void main(String[] args) {
		// Create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// Get spring bean class object reference
		MainController controller = factory.getBean("controller", MainController.class);
		// Read input values and store them into VO class object

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee name:");
		String name = sc.next();
		System.out.print("Enter Employee designation:");
		String desg = sc.next();
		System.out.print("Enter Employee basic salary:");
		String basicSalary = sc.next();

		// Employee VO object
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(name);
		vo.setDesg(desg);
		vo.setBasicSalary(basicSalary);

		// Invokes methods
		try {
			String result = controller.processEmployee(vo);
			System.out.println(result);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Internal problem::" + e.getMessage());
		}

	}

}
