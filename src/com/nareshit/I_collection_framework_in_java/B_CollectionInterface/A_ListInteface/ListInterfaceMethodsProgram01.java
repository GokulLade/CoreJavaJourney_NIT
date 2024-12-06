package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface;

import java.util.List;
import java.util.Vector;

public class ListInterfaceMethodsProgram01 {

	public static void main(String[] args) 
	{
		List<Integer> al = new Vector<Integer>();
		
		al.add(101);		
		al.add(102);		
		al.add(102);		
		al.add(104);		
		al.add(105);		

		System.out.println(al.isEmpty()); //isEmpty()
		
		System.out.println(al.size()); //size()
		
		al.add(0,100); //add(index,Object)
		System.out.println(al);
		
		al.set(3, 103);//set(index,Object) 
		System.out.println(al);
		
		System.out.println(al.get(3)); //get(index)
		
		al.remove(0); //remove(index)
		System.out.println(al);
		
		al.remove(Integer.valueOf(105)); //remove(Object)
		System.out.println(al);
		
		System.out.println(al.indexOf(104)); //index(Object)
		
		System.out.println(al.lastIndexOf(103)); //lastIndexOf(Object)
		
		List<Integer> al1 = new Vector<Integer>();
		
		al1.add(12);
		al1.add(13);
		al1.add(14);
		al1.add(15);
		
		al.addAll(2,al1);// addAll(index, Collection)
		System.out.println(al);
		
		al1.clear(); //clear()
		System.out.println(al1);
	}

}
