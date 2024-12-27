package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;

class Parent1
{
}
class Child1 extends Parent1
{
}

public class ProgramWithoutWildCardChar
{
public static void main(String [] args)
	{	
//		ArrayList<Parent1> lp = new ArrayList<Child1>(); error

		ArrayList<Parent1> lp1 = new ArrayList<Parent1>(); 

		ArrayList<Child1> lp2 = new ArrayList<>(); 

		System.out.println("Success");
	}
}

