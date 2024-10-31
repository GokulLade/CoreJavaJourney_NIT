package com.nareshit.a_demoprograms;

import java.util.Scanner;

class StudentDetail{
	private int studentId;
	private String studentName;
	private double studentFees;
	

	
	public StudentDetail(int studentId, String studentName, double studentFees) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}
	
	public static StudentDetail getObject()
	{
		try {
			
		}
		catch (Exception e) {
			System.err.println(e.getClass().getName());
		}
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Student ID..!!");
		int id=scanner.nextInt();
		
		System.out.println("Enter student Name..!!");
		String name=scanner.nextLine();
		name=scanner.nextLine();
		
		System.out.println("Enter student Fees..!!");
		double fees=scanner.nextDouble();
	
		
		return new StudentDetail(id, name, fees);
	}

	@Override
	public String toString() {
		return "StudentDetail [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+"]";
	}
	
}

public class ReturnTypeProgram01 {
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many Student Object you want..!!");
		int studentObject=scanner.nextInt();
		
		for(int i=1;i<=studentObject;i++) {
			StudentDetail student=StudentDetail.getObject();
			
			System.out.println(student);
		}
		
		scanner.close();
		
	}

}
