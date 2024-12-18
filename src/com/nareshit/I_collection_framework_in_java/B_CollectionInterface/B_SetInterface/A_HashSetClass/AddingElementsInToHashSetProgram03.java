package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.A_HashSetClass;

import java.util.Arrays;
import java.util.HashSet;

public class AddingElementsInToHashSetProgram03 {

	public static void main(String[] args) 
	{
		Boolean b1[] = new Boolean[6];
		
		HashSet<Object> hs = new HashSet<>();
		
		b1[0] = hs.add(65);  //true
		b1[1] = hs.add("P"); //true
		b1[2] = hs.add("nit"); //true
		b1[3] = hs.add(new String("nit")); //false
		b1[4] = hs.add(new StringBuffer("Hyd")); //true
		b1[5] = hs.add(new StringBuffer("Hyd")); //true
		
		System.out.println(Arrays.toString(b1));

		System.out.println(hs);


	}

}
