package com.nareshit.I_collection_framework_in_java.B_CollectionInterface;

import java.util.*;

public class CollectionInterfaceMethodsProgram01 {

	public static void main(String[] args)
	{
		List<Integer> al=new Vector<Integer>();
		al.add(11);  // add()
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		System.out.println(al);
		
		List<Integer> al1=new Vector<Integer>();
		al1.add(130);
		al1.add(140);
		al1.add(150);
		
		al.addAll(al1);  //addAll()
		System.out.println(al);
		
		al.retainAll(al1);  //retailAll()
		System.out.println(al);
		
		int size=al.size();	//size()
		System.out.println(size);
		
		al.remove(Integer.valueOf(140));  //This  method takes the object so Integer coverted  into object
		System.out.println(al); 
		
		al.removeAll(al1);//Remove common element
		System.out.println(al);
		
		al1.clear();  //clear()
		System.out.println(al1);
	}

}
