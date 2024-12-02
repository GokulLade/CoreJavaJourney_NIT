package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Employee1{
	
	int id;
	String name;
	
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class DeepCopyProgram01 {

	public static void main(String[] args) 
	{
		Employee1 e1=new Employee1();
		e1.id=101; e1.name="Gokul";
		
		Employee1 e2 =new Employee1();
		e2.id=e1.id; e2.name=e1.name;
		
		System.out.println(e1+" "+e2);
		
		e1.id=102; e1.name="Ganesh";
		System.out.println(e1+" "+e2);//Both object are not changed
		
		System.out.println(e1.hashCode()+" "+ e2.hashCode()); //Both are ref to diff object so hashcode is not same

	}

}
