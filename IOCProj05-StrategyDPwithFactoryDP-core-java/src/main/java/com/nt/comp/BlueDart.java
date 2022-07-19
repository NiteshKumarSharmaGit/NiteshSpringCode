package com.nt.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart-0-Param constructor..");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order delivered";
	}

}
