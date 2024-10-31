package com.nareshit.a_demoprograms;


class StudentDemo{
	StudentDemo m1() 
	{
		System.out.println("Student method");
		return null;
	}
}
public class Demo {

	public static void main(String[] args) 
	{
		StudentDemo studentDemo= new StudentDemo().m1();
	}

}