package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.A_abstractprograms;

abstract class Student{
	
	abstract void study();
	abstract void sleep();
	abstract void doClasses();
}

class ITStudent extends Student{

	@Override
	void study() 
	{
		System.out.println("Study 8 hrs in a day..!!");
	}

	@Override
	void sleep() 
	{
		System.out.println("Sleep 6 hrs in a day..!!");
		
	}

	@Override
	void doClasses() 
	{
		System.out.println("Classes 10 hrs in a day..!!");
		
	}
	
	static void callMethods()
	{
		ITStudent student=new ITStudent();
		student.study();
		student.sleep();
		student.doClasses();
	}
	
}
public class AbstractionProgram01 {

	public static void main(String[] args) 
	{
		ITStudent.callMethods();
	}

}
