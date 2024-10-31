package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface Boys{
	void eat();
}

interface Girls{
	void eat();
}

class Humans implements Boys, Girls{

	@Override
	public void eat() 
	{
		System.out.println("Boys and Girls are eating..!!");
		
	}
	
}
public class MultipleInheritanceProgram01 {

	public static void main(String[] args) 
	{
		new Humans().eat();

	}

}
