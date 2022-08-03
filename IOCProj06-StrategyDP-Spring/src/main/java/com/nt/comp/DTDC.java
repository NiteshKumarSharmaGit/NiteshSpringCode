package com.nt.comp;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC-0-Param constrcutor........");
	}

	public String deliver(int oid) {
		return oid + "order delivered";
	}
}
