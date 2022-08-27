package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.nt.beans.WishMessageGenerator;
public class SetterInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//Spring bean with same ID
		WishMessageGenerator generator1 = factory.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hashcode of generator1:" + generator1.hashCode() + " " + "hasch code of generator2:"
				+ generator2.hashCode());
		System.out.println("generator1==generator2:" + (generator1 == generator2));
		System.out.println("===================================================");
		//spring bean with two different bean ID's
		WishMessageGenerator generator3=factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator4=factory.getBean("wmg1",WishMessageGenerator.class);
		System.out.println("generatpr3 hashcode:"+generator3.hashCode()+" "+"generator4 hashCode:"+generator4.hashCode());
		System.out.println("generatpr3==generator4:"+(generator3==generator4));
	}
}
