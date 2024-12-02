package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Student2 implements Cloneable{
	
	int rollNumber;
	int age;
	String name;
	
	public Student2(int rollNumber, int age, String name) 
	{
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
	}

	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "Student2 [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class CloneMethodProgram01 {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Student2 s1=new Student2(101, 22, "Gokul");
		Student2 s2=(Student2)s1.clone(); // Object copy using clone method
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.rollNumber=102; s2.age=22; s2.name="Ganesh";
		
		System.out.println(s1);//Both object are not changed
		System.out.println(s2);
		
		System.out.println(s1.hashCode());//Both are ref to diff object so hashcode is not same
		System.out.println(s2.hashCode());

	}

}
