package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

// It is clear that interface static method is not available to implementer class.
interface Drawable
{
	public static void m1()
	{
		System.out.println("m1 static method of interface");
	}
}

public class StaticMethodProgram06 implements Drawable {

	public static void main(String[] args)
	{
		// m1(); //Invalid InterfaceStatic.m1(); //Invalid
		StaticMethodProgram06 is = new StaticMethodProgram06();
		// is.m1(); //Invalid
		Drawable.m1();
	}
}
