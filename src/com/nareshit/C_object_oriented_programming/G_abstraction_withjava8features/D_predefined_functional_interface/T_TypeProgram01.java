package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

class Accept<T>
{
	private T x;
	public Accept(T x)
	{
		this.x=x;
	}
	
	public T getValue()
	{
		return x;
	}
}

public class T_TypeProgram01 {

	public static void main(String[] args) 
	{
		Accept<Integer> valueInt =new Accept<Integer>(10);
		System.out.println(valueInt.getValue());
		
		Accept<String> valueString =new Accept<String>("Gokul");
		System.out.println(valueString.getValue());

	}

}
