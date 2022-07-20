package com.nt.comp;

public class DeiselEngine implements Engine {
	public DeiselEngine() {
		System.out.println("DeieselEngine-0-param constructor..........");
	}

	public String start(int eno) {
		return eno + "Deiselengine started";
	}

}
