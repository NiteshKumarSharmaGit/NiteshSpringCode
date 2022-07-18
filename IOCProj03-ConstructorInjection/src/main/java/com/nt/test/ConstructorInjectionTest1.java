package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest1 {

	public static void main(String[] args) {
			DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/nt/cf/applicationContext.xml");
			Object obj = factory.getBean("wmg");
			WishMessageGenerator generator = (WishMessageGenerator) obj;
			String result = generator.generateMessage("Raja");
			System.out.println("Wish message is" + result);
	}

}
