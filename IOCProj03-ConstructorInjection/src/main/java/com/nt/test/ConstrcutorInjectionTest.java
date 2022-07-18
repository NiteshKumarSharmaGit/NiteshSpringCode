package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstrcutorInjectionTest {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String result = generator.generateMessage("Raja");
		System.out.println("Wish message is" + result);
	}

}
