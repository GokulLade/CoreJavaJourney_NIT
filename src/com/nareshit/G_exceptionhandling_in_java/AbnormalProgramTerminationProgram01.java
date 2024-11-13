package com.nareshit.G_exceptionhandling_in_java;

/* WAP that describes that whenever an exception is encounter in the program then program will be terminated
in the middle.*/
public class AbnormalProgramTerminationProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started..");
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println("Result is :"+ c);
		
		System.out.println("Main Method End..");

	}

}
