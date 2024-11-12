package com.nareshit.a_demoprograms;

interface I1{
	default void m1()
	{
		System.out.println("Interface Default method");
	}
}
class C1{
	public void m1()
	{
		System.out.println("Class method");
	}
}

class Demo1 extends C1 implements I1{
	
}
public class Demo {

	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		d.m1();
		
	}

}