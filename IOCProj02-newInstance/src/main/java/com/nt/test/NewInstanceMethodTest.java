package com.nt.test;

public class NewInstanceMethodTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Load class
		Class c1 = Class.forName(args[0]);
		Class c2 = Class.forName(args[1]);

		// create object
		Object obj1 = c1.newInstance();
		Object obj2 = c2.newInstance();

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
