package com.nt.comp;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC-0-Param constructor..");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order delivered";
	}

}
