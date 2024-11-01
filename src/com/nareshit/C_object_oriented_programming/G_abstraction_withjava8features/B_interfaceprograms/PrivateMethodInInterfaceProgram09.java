package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

// We can achieve 100% abstraction by using private method inside interface.
interface Acceptable
{
	void m1();  //[Abstract Method, JDK 1.0] 
	
	default void m2() //[default Method, JDK 1.8]
	{
		System.out.println("Default Method of an interface");
		m4();
		m5();
	}
	
	static void m3() //[static Method, JDK 1.8]
	{
		System.out.println("Static Method of an interface");
		m5();		
	}
	
	private void m4()  //[Private non static method, JDK 9]
	{
		System.out.println("Private non Static Method of an interface");
	}
	
	private static void m5()  //[Private static method, JDK 9]
	{	
		System.out.println("Private Static Method of an interface");
	}	
	
	/*default void m6()
	{
		System.out.println("Another Default method");
		m4();  //Re-Using our private methods
		m5();
	}*/
	
	
}
class Implementer1 implements Acceptable
{
	@Override
	public void m1() 
	{
		System.out.println("Abstract method Implemented");		
	}
	
}

public class PrivateMethodInInterfaceProgram09 {

	public static void main(String[] args) 
	{
		Acceptable a1 = new Implementer1();
		a1.m1();
		a1.m2();	
		Acceptable.m3();
		//a1.m6();

	}
}

