package com.nareshit.a_demoprograms;

class Super{
	
	static
	{
		System.out.println("A");
	}
	
	{
		System.out.println("B");
	}
	public Super()
	{
		System.out.println("c");
	}
}
class Sub extends Super{
	
	static
	{
		System.out.println("D");
	}
	{
		System.out.println("E");
	}
	public Sub()
	{
		System.out.println("F");
	}
}

public class Demo{
	
	public static void main(String[] args) 
	{
		new Sub();
		
	}
}