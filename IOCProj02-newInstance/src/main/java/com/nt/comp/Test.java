package com.nt.comp;

public class Test {
	private int a = 10;
	private String b = "hello";

	public Test() {
		System.out.println("Test.Test()-0-param-constructorssss");
	}
	public Test(int a,String b) {
		System.out.println("Test.Test()-2 param constructor");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
