package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

// Static method of an interface is by default public and it is accessible through interface name only.
interface Calculate
{
	static double doSum(int x, int y)
	{
		return (x+y);
	}
	
	static double getCube(int num)
	{
		return (num*num*num);
	}
}


public class StaticMethodProgram05 {

	public static void main(String[] args) 
	{	
		System.out.println(Calculate.doSum(10, 30));
		System.out.println(Calculate.getCube(5));
	}

}
