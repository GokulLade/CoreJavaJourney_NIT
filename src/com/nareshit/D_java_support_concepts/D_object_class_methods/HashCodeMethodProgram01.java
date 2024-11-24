package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Demo{
	
}

public class HashCodeMethodProgram01 {

	public static void main(String[] args)
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		System.out.println(d1.hashCode()+" "+d2.hashCode());
		
		Demo d3=d2;
		System.out.println(d2.hashCode()+" "+d3.hashCode());

		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d2.equals(d3));
	}

}
