package com.nareshit.D_java_support_concepts.G_enum_in_java;

enum Test{
	T1,T2,T3;
	
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block");
	}
}

public class EnumProgram16 {

	public static void main(String[] args) 
	{
		System.out.println(Test.T1);
	}
}
