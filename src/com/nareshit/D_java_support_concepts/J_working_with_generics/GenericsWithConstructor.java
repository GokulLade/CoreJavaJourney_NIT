package com.nareshit.D_java_support_concepts.J_working_with_generics;

class MyAccept
{
	
	public <T> MyAccept(T value)  //Constructor is Generic Type
	{
		System.out.println(value);
	}
}
public class GenericsWithConstructor
{
	public static void main(String[] args) 
	{
		MyAccept myAccept1 = new MyAccept(12);
		MyAccept myAccept2 = new MyAccept("Ravi");
		MyAccept myAccept3 = new MyAccept(new String("NIT"));

	}

}

