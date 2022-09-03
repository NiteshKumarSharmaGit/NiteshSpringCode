package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StraTegyDPTest2 {
	public static void main(String[] args) {
		// creating IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfg/applicationContext.xml");
		// get target class object
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		// invoking business method
		String resultMsg = fpkt.shopping(new String[] { "Shirt", "Trouser", "pant" },
				new float[] { 1000.0f, 2000.0f, 3000.0f });
		System.out.println(resultMsg);
		ctx.close();

	}

}
