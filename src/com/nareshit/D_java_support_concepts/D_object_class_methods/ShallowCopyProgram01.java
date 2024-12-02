package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Student1{
	
	int id;
	String name;
	
	public Student1(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ShallowCopyProgram01 {

	public static void main(String[] args) 
	{
		Student1 s1=new Student1(101,"Gokul");
		System.out.println(s1);
		
		Student1 s2=s1; //shallow copy
		System.out.println(s2);
		
		s1.id=102;
		s1.name="Ganesh";
		
		System.out.println(s1); //Both object are changed
		System.out.println(s2); 

		System.out.println(s1.hashCode()+" "+s2.hashCode()); //Both are ref to same object so hashcode is same
	}

}
