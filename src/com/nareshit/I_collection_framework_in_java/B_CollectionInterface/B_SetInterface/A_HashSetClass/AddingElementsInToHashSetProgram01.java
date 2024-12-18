package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.A_HashSetClass;

import java.util.HashSet;

public class AddingElementsInToHashSetProgram01 {

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Hanuman");
		hs.add("Shyam");
		hs.add("Ram");
		hs.add("Om");
		hs.add(null);
		
		hs.forEach((s1)->System.out.println(s1));
		

	}

}
