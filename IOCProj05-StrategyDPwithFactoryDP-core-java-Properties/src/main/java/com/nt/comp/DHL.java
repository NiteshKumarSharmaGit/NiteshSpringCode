package com.nt.comp;

public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL-constrcuotr........");
	}

	@Override
	public String deliver(int oid) {
		return oid + "order deliverd";
	}

}
