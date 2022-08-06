package com.nt.beans;

public class A {
	private B b;

	public A() {
		System.out.println("A.A()-0-param constrcutor....");
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("A.setA()-0-param constructor....");
	}

	@Override
	public String toString() {
		return "A [a=]";
	}

}
