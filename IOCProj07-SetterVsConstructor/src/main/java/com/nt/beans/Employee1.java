package com.nt.beans;

public class Employee1 {
	// All properties are mandatory
	private int eid;
	private String ename;
	private float billAmt;

	// constructor
	public Employee1(int eid, String ename, float billAmt) {
		System.out.println("Employee-1 3 param construcctor....");
		this.eid = eid;
		this.ename = ename;
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", esal=" + ename + ", billAmt=" + billAmt + "]";
	}

}
