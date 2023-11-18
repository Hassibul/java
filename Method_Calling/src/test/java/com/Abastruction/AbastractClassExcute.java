package com.Abastruction;

public class AbastractClassExcute extends AbastractClassA {

	@Override
	public void getName() {
		System.out.println("my name is Hassibul");

	}

	public static void main(String[] args) {
		AbastractClassExcute obj = new AbastractClassExcute();
		obj.getHouse();
		obj.getName();
	}
}
