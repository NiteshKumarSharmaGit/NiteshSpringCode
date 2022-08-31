package com.nt.ston;

public class Printer {
	// static variable
	private static Printer INSTANCE;

	// constructor
	private Printer() {
		System.out.println("printer () -0 param constructor..........");
	}

	// Static factory method
	public static Printer getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}

	// b.method
	public void print(String msg) {
		System.out.println(msg);
	}

}
