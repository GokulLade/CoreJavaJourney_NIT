package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class EqualsMethodProgram01 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(111,"Gokul");
		Employee e2=new Employee(22,"Ganesh");
		
		System.out.println(e1==e2); //false
		System.out.println(e1.equals(e2)); //false

	}

}
