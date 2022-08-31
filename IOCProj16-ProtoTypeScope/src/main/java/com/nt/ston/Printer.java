package com.nt.ston;

public class Printer {
	// static variable type of printer
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer.Printer()-0 param constructor..............");
	}

	// static factory method
	public static Printer getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}

	// B method
	public void print(String msg) {
		System.out.println(msg);
	}

}
