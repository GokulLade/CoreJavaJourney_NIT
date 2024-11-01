package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

/* If two default methods needed to share common and confidential code, a private method would allow them to 
   do so, but without exposing that private method to it s implementing classes.*/
interface I4{
	default void print()
	{
		masseage();
		System.out.println("In Method..!!");
	}
	default void display()
	{
		masseage();
		System.out.println("In Method..!!");
	}
	
	private void masseage()
	{
		System.out.println("Start Point Method..!!");
	}
}

class C2 implements I4{
	
}
public class PrivateMethodInInterfaceProgram08 {
	
	public static void main(String[] args) 
	{
		I4 i=new C2();
		i.display();
		i.print();
	}

}
