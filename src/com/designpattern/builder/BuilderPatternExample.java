package com.designpattern.builder;

public class BuilderPatternExample {

	public static void main(String args[]){
		
		Car car = new Car.Builder().modelName("Hyundai i20").color("white").automaticGear(true).build();
		
		System.out.println(car);
	}
}
