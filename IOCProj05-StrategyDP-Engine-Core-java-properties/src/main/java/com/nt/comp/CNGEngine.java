package com.nt.comp;

public class CNGEngine implements Engine {
	public CNGEngine() {
		System.out.println("CNGEngine 0-param construcor....");
	}

	public String start(int eno) {
		return eno + "CNGEngine started";
	}

}
