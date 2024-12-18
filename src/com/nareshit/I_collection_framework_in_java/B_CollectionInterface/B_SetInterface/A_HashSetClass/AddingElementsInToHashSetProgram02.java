package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.A_HashSetClass;

import java.util.HashSet;

public class AddingElementsInToHashSetProgram02 {
	
	public static void main(String[] args) 
	{
		  	HashSet<Integer> hs = new HashSet<>();
			hs.add(67); 
			hs.add(89);		
			hs.add(33);
			hs.add(null);
			hs.add(45);
			hs.add(12);
			hs.add(35);	
			
			hs.forEach(num-> System.out.println(num));

	}

}
