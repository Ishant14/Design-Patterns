package com.designpattern.builder;

public class Car {
	
	private final int wheels;
	private final String color;
	private final String modelName;
	private final boolean automaticGear;
	
	public static class Builder{
		
		private int wheels;
		private String color;
		private  String modelName;
		private boolean automaticGear;
		
		public Builder wheels(int number){
			this.wheels=number;
			return this;
		}
		
		public Builder color(String color){
			this.color = color;
			return this;
		}
		
		public Builder modelName(String name){
			this.modelName = name;
			return this;
		}
		
		public Builder automaticGear(boolean automaticGear){
			this.automaticGear=automaticGear;
			return this;
		}
		
		//return fully build object
		public Car build(){
			return new Car(this);
		}
		
	}
	
	private Car(Builder builder){
		this.color=builder.color;
		this.automaticGear=builder.automaticGear;
		this.modelName=builder.modelName;
		this.wheels=builder.wheels;
		
	}
	
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", color=" + color + ", modelName=" + modelName + ", automaticGear="
				+ automaticGear + "]";
	}

}
