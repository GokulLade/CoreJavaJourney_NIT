package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;

public class ProblemWithOutGenerics {

	public static void main(String[] args) 
	{
		ArrayList t = new ArrayList(); // raw type
		t.add("alpha");
		t.add("beta");
		
		for (int i = 0; i < t.size(); i++) 
		{
			String str = (String) t.get(i);
			System.out.println(str);
		}

		t.add(1234);
		t.add(1256);
		for (int i = 0; i < t.size(); ++i) 
		{
			String obj = (String) t.get(i); // we can't perform type casting here [ClassCastException]
			System.out.println(obj);
		}

	}

}
