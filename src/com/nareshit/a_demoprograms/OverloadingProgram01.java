package com.nareshit.a_demoprograms;

class Print{
	static void display() // 1
	{
		System.out.println("Super Static Method..!!");
	}
	
	void print()
	{
		System.out.println("Super non-Static Method..!!");
	}
}

class Display extends Print{
	static void display()
	{
		System.out.println("Sub Static Method..!!");
	}
	
	void print()
	{
		System.out.println("Sub non-Static Method..!!"); //2
	}
	
}
public class OverloadingProgram01 {
	
	public static void main(String[] args)
	{
		Print p=new Display();
		p.display();
		p.print();
		
	}

}
