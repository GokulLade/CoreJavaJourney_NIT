package com.nareshit.I_collection_framework_in_java.C_MapInterface.E_IdentityHashMap;

public class SystemHashCodeProgram {

	public static void main(String[] args) 
	{
		String str = "india";		
		System.out.println(str.hashCode());
		
		System.out.println(System.identityHashCode(str));


	}

}
