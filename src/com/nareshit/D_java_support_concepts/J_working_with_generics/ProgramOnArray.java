package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.Arrays;

public class ProgramOnArray {

	public static void main(String[] args) 
	{
		
		 /*
		   ArrayList<Object> al = new ArrayList<String>(); [Compile time]
		   ArrayList al = new ArrayList();  [Runtime, Type Erasure]
		   al.add("Ravi");
		   */
		     

			Object []obj = new String[3]; //valid with Array
			obj[0] = "Ravi";
			obj[1] = "hyd";
			obj[2] =  90; //java.lang.ArrayStoreException
			System.out.println(Arrays.toString(obj));
	}


}

