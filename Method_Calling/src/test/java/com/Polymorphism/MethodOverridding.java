package com.Polymorphism;

public class MethodOverridding {

	public void getName(String name, int salary) {
		System.out.println("my name is ::" + name + "my salary is ::" + salary);
	}

	public void getName(int salary, String name) {
		System.out.println("my salary is ::" + salary + "my name is ::" + name);
	}

	public void getName(double salary, String name) {
		System.out.println("my salary is ::" + salary + "my name is ::" + name);
	}

	public static void main(String[] args) {
		MethodOverridding obj = new MethodOverridding();
		obj.getName("Zahid", 12000);
		obj.getName(10000, "Fargab");
		obj.getName(8000, "Hassibul");

	}
}
