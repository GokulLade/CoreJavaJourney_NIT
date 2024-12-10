package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.Vector;

//Vector Program on capacity
public class VectorCapacityProgram01 {

	public static void main(String[] args) 
	{
		Vector<Integer> number=new Vector<>(100,10);
		
		System.out.println("Initial Capacity is : "+number.capacity());
		
		for(int i=0;i<100;i++)
		{
			number.add(i);
		}
		
		System.out.println("After Adding 100 elements Capacity is: "+number.capacity());

		number.add(101);
		System.out.println("After Adding 101 elements Capacity is: "+number.capacity());
	}

}
