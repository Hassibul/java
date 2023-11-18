package com.Polymorphism;

public class MethodOverriddingB extends MethodOverridding {

	public void getName(int bonus, int salary) {
		System.out.println("my bonus is ::" + bonus + "  " + "my salary is ::" + salary);
	}

	public static void main(String[] args) {
		MethodOverriddingB obj = new MethodOverriddingB();
		obj.getName(2000, 80000);
		obj.getName(10000, "Fargab");
		obj.getName(8000, "Hassibul");
	}
}
