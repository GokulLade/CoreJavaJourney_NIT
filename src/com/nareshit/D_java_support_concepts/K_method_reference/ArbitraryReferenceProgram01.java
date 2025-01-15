package com.nareshit.D_java_support_concepts.K_method_reference;

import java.util.TreeSet;

public class ArbitraryReferenceProgram01 {

	public static void main(String[] args) 
	{
		//Using String class calling method comareTo(non-static method)
		TreeSet<String> ts = new TreeSet<>(String::compareTo);
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
		System.out.println(ts);

	}

}
