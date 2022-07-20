package com.nt.beans;

public class Student {
	// all properties are not mandatory
	private String name;
	private String collegeName;
	private int age;
	private String qlfy;

	// setter method
	public void setName(String name) {
		this.name = name;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + ", age=" + age + ", qlfy=" + qlfy + "]";
	}
	

}
