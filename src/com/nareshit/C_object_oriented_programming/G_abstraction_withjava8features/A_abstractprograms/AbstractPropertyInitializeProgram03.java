package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.A_abstractprograms;

class StudentDetails{
	
	protected int studentRollNo;
	protected String studentName;
	
	public StudentDetails(int studentRollNo, String studentName) 
	{
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student Roll number is :"+ studentRollNo);
		System.out.println("Student Name is :"+ studentName);
	}
	
}

class Om extends StudentDetails{

	public Om(int studentRollNo, String studentName) 
	{
		super(studentRollNo, studentName);
		
	}
	
}

public class AbstractPropertyInitializeProgram03 {

	public static void main(String[] args) 
	{
		StudentDetails omDetails=new Om(101, "Om");
		omDetails.displayStudentDetails();

	}

}
