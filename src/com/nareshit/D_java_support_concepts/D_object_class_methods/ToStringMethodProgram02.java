package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Print{
	
	@Override
	public String toString()
	{
		return "Gokul";
	}
}

public class ToStringMethodProgram02 {

	public static void main(String[] args) 
	{
		Print p=new Print();
		System.out.println(p);

	}

}
