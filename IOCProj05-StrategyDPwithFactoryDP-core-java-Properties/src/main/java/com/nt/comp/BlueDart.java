package com.nt.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("0-param-Bluedart constructor........");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order delivered";
	}

}
