package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.A_abstractprograms;

abstract class Car{
	
	protected int speed = 90;
	
	public Car()
	{
		System.out.println("Car class constructor..");
	}
	
	public void carDetails()
	{
		System.out.println("It has 1 engine and 4 wheels ");
	}
	
	public abstract void run();
}

class Honda extends Car{
	
	@Override
	public void run()
	{
		System.out.println("Honda car is running");
	}
}

public class CarProgram02 {

	public static void main(String[] args) 
	{
		Car c = new Honda();
		System.out.println("Car Speed is :"+c.speed);c.carDetails();
		
		c.run();

	}

}
