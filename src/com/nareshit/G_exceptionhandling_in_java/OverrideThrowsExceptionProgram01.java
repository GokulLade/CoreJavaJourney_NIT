package com.nareshit.G_exceptionhandling_in_java;

class Super{
	
	public void display() 
	{
		System.out.println("Display Method in Super class");
	}
}

class Sub extends Super{
	
	@Override
	public void display() throws ArrayIndexOutOfBoundsException //ClassNotFoundException all Checked Exception not Allowed here
	{
		System.out.println("Display Method in Sub class");
	}
}


public class OverrideThrowsExceptionProgram01 {

	public static void main(String[] args) 
	{
		

	}

}
