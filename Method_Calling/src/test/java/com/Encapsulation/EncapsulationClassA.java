package com.Encapsulation;

public class EncapsulationClassA {

	private String carModel = "BMW";
	private int price = 80000;

	public String getCarModel() {
		System.out.println("i need the car");
		return carModel;
	}

	private int getPrice() {
		return price;
	}

	public static void main(String[] args) {
		EncapsulationClassA obj = new EncapsulationClassA();
		System.out.println("i need the car ::" + obj.getCarModel());
		System.out.println("i need the money ::" + obj.getPrice());
	}

}
