package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StraTegyDPTest {
	public static void main(String[] args) {
		// creating IOC container
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
		// get target class objcet
		Flipkart fpkt = defaultListableBeanFactory.getBean("fpkt", Flipkart.class);
		// invoking business method
		String resultMsg = fpkt.shopping(new String[] { "Shirt", "Trouser", "pant" },
				new float[] { 1000.0f, 2000.0f, 3000.0f });
		System.out.println(resultMsg);

	}

}
