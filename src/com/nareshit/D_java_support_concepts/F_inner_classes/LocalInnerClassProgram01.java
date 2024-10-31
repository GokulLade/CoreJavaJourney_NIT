package com.nareshit.D_java_support_concepts.F_inner_classes;

class OuterDemo{
	
	void localClass()
	{
		
		class DisplayData{
			
			void display()
			{
				System.out.println("Inside the Local class Method..!!");
			}
		}
		
		DisplayData data=new DisplayData();
		data.display();
	}
	
	
}

public class LocalInnerClassProgram01 {

	public static void main(String[] args) 
	{
		OuterDemo outer= new OuterDemo();
		outer.localClass();

	}

}
