package com.nareshit.D_java_support_concepts.D_object_class_methods;

public class HashCodeMethodProgram02 {

	public static void main(String[] args) 
	{
		String a="A";
		Integer i=65;
		
		System.out.println(a.equals(i)); //equals is False but hashcode is same
		System.out.println(a.hashCode()+" "+i.hashCode());

	}

}
