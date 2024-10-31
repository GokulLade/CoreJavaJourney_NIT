package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface Vehicle{
	void run();
	void horn();
	
	default void digitalMeter()
	{
		System.out.println("Digital Meter Facility coming soon");
	}
}

class Car implements Vehicle{

	@Override
	public void run() 
	{
		System.out.println("Car is running..!!");
		
	}

	@Override
	public void horn() 
	{
		System.out.println("Car has horn..!!");
		
	}
	
}

class Bike implements Vehicle{

	@Override
	public void run() 
	{
		System.out.println("Bike is running..!!");
		
	}

	@Override
	public void horn() 
	{
		System.out.println("Bike has horn..!!");
		
	}
	
	@Override
	public void digitalMeter()
	{
		System.out.println("Car has Digital meter facility");
	}
	
}

public class DefaultMethodInterfaceProgram02 {

	public static void main(String[] args) 
	{
		Vehicle v = null;
		v = new Car(); 
		v.run();
		v.horn(); 
		v.digitalMeter();
		
		v = new Bike(); 
		v.run(); 
		v.horn(); 
		v.digitalMeter();

	}

}
