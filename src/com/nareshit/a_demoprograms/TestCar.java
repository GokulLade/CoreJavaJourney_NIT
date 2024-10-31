package com.nareshit.a_demoprograms;

class Engine{
	private String model;
	
	public Engine(String model) {
		this.model=model;
	}
	public String getModel() {
		return "Model";
	}
	
	@Override
	public String toString() {
		return model;
	}
}

class Car{
	String make;
	String model;
	Engine engine;
	public Car(String make, String model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car make=" + make + "\n model=" + model + "\n engine=" + engine;
	}	

}
public class TestCar {
	
	public static void main(String[] args) {
		Engine e1=new Engine("Hybrid");
		Car c1=new Car("Kia","120D",e1);
		
		System.out.println(c1);
		
	}

}
