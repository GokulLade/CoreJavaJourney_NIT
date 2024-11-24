package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Test{
	
}

public class GetClassMethodProgram01 {

	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.getClass()); //class + FQN
		System.out.println(t.getClass().getName()); //FQN
	}

}
