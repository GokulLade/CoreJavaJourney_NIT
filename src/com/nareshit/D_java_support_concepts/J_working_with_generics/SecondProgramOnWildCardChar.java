package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;
import java.util.List;

class Alpha
{
}
class Beta extends Alpha
{
}
class Gamma extends Beta
{
}

public class SecondProgramOnWildCardChar {
	
	public static void main(String[] args) 
	{
		List<? extends Number> list1 = new ArrayList<Long>();

		List<? super String> list2 = new ArrayList<Object>();

		List<? super Gamma> list3 = new ArrayList<Beta>();

		List list4 = new ArrayList();
		
		System.out.println("yes");

	}

}
