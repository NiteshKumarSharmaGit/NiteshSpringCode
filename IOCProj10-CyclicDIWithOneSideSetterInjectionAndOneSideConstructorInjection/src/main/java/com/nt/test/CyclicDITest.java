package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		// create spring IOC
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// get spring bean class object
		A oa = factory.getBean("a1", A.class);// This call will work
		System.out.println(oa);
		
		/*B ob=factory.getBean("b1",B.class);/// This call will not work
		System.out.println(ob);*/

	}

}
