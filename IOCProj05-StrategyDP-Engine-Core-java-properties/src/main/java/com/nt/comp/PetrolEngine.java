package com.nt.comp;

public class PetrolEngine implements Engine {
	public PetrolEngine() {
		System.out.println("PetrolEngine 0-param constructor..........");
	}

	public String start(int eno) {
		return eno + "Petrolengine started.";
	}

}
