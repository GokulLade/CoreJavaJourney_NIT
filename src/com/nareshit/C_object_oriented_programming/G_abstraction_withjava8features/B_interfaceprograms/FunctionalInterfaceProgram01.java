package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

@FunctionalInterface
interface CollegeStudent
{
	void writeExam();
}

public class FunctionalInterfaceProgram01 {

	public static void main(String[] args) 
	{
		CollegeStudent student1=new CollegeStudent() 
		{
			@Override
			public void writeExam() 
			{
				System.out.println("Student One Writing Exam");
				
			}
		};
		student1.writeExam();
		
		CollegeStudent student2=new CollegeStudent() 
		{
			@Override
			public void writeExam() 
			{
				System.out.println("Student Two Writing Exam");
				
			}
		};
		student2.writeExam();

	}

}
