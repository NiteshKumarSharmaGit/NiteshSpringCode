package com.nt.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		// invoke business method
		String result = generator.generateMessage("Nitesh");
		System.out.println("Wish mesaage is::" + result);
		ctx.close();
	}// main
}// class
