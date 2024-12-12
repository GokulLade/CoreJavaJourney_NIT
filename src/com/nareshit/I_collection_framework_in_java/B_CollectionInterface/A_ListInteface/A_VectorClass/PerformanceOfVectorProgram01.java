package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.ArrayList;
import java.util.Vector;

//Program to describe that ArrayList is better than Vector in performance
public class PerformanceOfVectorProgram01 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		long startTime=System.currentTimeMillis();
		for(int i=1;i<=1000000;i++) al.add(i);
		long endTime=System.currentTimeMillis();
		
		System.out.println("Total time Arraylist is take : "+(endTime-startTime));
		
		Vector<Integer> al1=new Vector<Integer>();
		
		startTime=System.currentTimeMillis();
		for(int i=1;i<=1000000;i++)al1.add(i);
		endTime=System.currentTimeMillis();
		
		System.out.println("Total time Vector is take : "+(endTime-startTime));
	}

}
