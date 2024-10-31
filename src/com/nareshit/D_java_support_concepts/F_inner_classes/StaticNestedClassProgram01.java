package com.nareshit.D_java_support_concepts.F_inner_classes;

class Outer{
	int x=90;
	static int y=100;
	
	static class inner{
		void display()
		{
			System.out.println(new Outer().x);
		}
		
		static void show()
		{
			System.out.println(y);
		}
		
	}
}

public class StaticNestedClassProgram01 {

	public static void main(String[] args) 
	{
		Outer.inner inner =new Outer.inner();
		inner.display();
		
		Outer.inner.show();
	}

}
