package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.function.Supplier;

class Student{
	
	private int rollNumber;
	private String studentName;
	
	public Student(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + "]";
	}
	
	
}
public class SupplierProgram01 {

	public static void main(String[] args)
	{
		Supplier<Student> student1=()-> new Student(101,"Gokul");
		Supplier<Student> student2=()-> new Student(102,"Ganesh");
		Supplier<Student> student3=()-> new Student(103,"Rushi");
		
		System.out.println(student1.get());
		System.out.println(student2.get());
		System.out.println(student3.get());
		
	}

}
