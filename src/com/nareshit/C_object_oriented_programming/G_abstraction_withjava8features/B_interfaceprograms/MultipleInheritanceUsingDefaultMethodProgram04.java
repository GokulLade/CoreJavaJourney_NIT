package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface I1{
	
	default void show()
	{
		System.out.println("Interface one deafult method..!!");
	}
}

interface I2{
	
	default void show()
	{
		System.out.println("Interface two deafult method..!!");
	}
}

class Implementer implements I1,I2{

	@Override
	public void show() 
	{
		System.out.println("Multiple inheritance is possiable using interface Default method..!!");
		I1.super.show();
		I2.super.show();
	}
	
}

public class MultipleInheritanceUsingDefaultMethodProgram04 {

	public static void main(String[] args) 
	{
		Implementer i=new Implementer();
		i.show();

	}

}
