package com.nareshit.G_exceptionhandling_in_java;

import java.io.FileNotFoundException;
import java.io.IOException;

class Super1{
	
	public void print()throws IOException
	{
		System.out.println("Print Method in super class");
	}
}
class Sub1 extends Super1{
	
	@Override
	public void print()throws FileNotFoundException
	{
		System.out.println("Print Method in sub class");
	}
}

public class OverrideThrowsExceptionProgram02 {

	public static void main(String[] args) 
	{
		
	}

}
