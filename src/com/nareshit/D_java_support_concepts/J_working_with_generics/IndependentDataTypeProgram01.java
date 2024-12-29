package com.nareshit.D_java_support_concepts.J_working_with_generics;

class Box<T>  
{
	private T data;

	public Box(T data) 
	{
		super();
		this.data = data;
	}

	public T getData() 
	{
		return data;
	}
	
}

record Employee(Integer id, String name)
{
	
}


public class IndependentDataTypeProgram01 {

	public static void main(String[] args) 
	{
		Box<Integer> intType = new Box<>(12);
		System.out.println("Integer type is :"+intType.getData());
		
		Box<Double>  doubleType = new Box<>(23.89);
		System.out.println("Double type is :"+doubleType.getData());
		
		Box<Employee>  empType = new Box<>(new Employee(111, "Scott"));
		System.out.println(empType.getData());

	}

}

