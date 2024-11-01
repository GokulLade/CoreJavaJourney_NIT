package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface A{
	
	default void display()
	{
		System.out.println("Interface default method..!!");
	}
}

class B{
	
	public void display()
	{
		System.out.println("Class method method..!!");
	}
}

class C extends B implements A{
	
}
public class DefaultMethodPriorityProgram03 {

	public static void main(String[] args) 
	{
		C c1=new C();
		c1.display();
	}

}
