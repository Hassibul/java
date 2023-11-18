package com.Constructor;

public class ConstructorA {

	public ConstructorA(String name) {
		System.out.println("Name :" + " " + name);

	}

	public ConstructorA(int salary) {
		System.out.println("salary :" + " " + salary);

	}

	public ConstructorA(char latter) {
		System.out.println("latter :" + " " + latter);
	}

	public static void main(String[] args) {
		ConstructorA obj = new ConstructorA("joy");
		ConstructorA obj2 = new ConstructorA(10000);
		ConstructorA obj3 = new ConstructorA('H');

	}

}
