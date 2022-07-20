package com.nt.beans;

public class Customer {
	// Below ther properties are mandatory
	private int cno;
	private String cname;
	private float billAmt;
	// Below two properties are optional
	private String caddrs;
	private long mobNo;

	public Customer(int cno, String cname, float billAmt) {
		System.out.println("Customer 3-param constructor.....");
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
	}

	

	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}



	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}



	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billAmt=" + billAmt + ", caddrs=" + caddrs + ", mobNo="
				+ mobNo + "]";
	}

}
