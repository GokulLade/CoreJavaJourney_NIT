package com.nareshit.D_java_support_concepts.K_method_reference;

import java.util.Scanner;
import java.util.function.Function;

class Student
{
	private Integer studentId;
	private String studentName;
	
	public Student(Integer studentId, String studentName) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}	
}

public class ConstructorReferenceProgram04 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

	 Scanner sc = new Scanner(System.in);
	 
	 Function<Integer,Student[]> fn1 = Student[]::new;	
	 
	 System.out.print("Enter the size of the Array :");
	 int size = sc.nextInt();
	 
	 Student[] students = fn1.apply(size);
	 
	 for(int i=0; i<students.length; i++)
	 {
		 System.out.print("Enter the Student id :");
		 int id = sc.nextInt();
		 
		 System.out.print("Enter Student Name :");
		 String name = sc.nextLine();
		 name = sc.nextLine();
		 
		 students[i] = new Student(id, name);
	 }
	 
	 
	 System.out.println("Fetching the data from Array Object :");
	 for(Student std : students)
	 {
		 System.out.println(std);
	 }
	 
	 
	}

}
