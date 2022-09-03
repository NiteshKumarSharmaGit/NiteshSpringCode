package com.nt.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("Bluedart 0-param constrcutor..........");
	}

	@Override
	public String deliver(int oid) {
		return oid + "delivered";
	}

}
