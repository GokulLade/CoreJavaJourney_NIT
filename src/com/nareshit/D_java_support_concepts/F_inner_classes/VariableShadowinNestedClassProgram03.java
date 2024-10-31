package com.nareshit.D_java_support_concepts.F_inner_classes;

/*

Variable Shadow in Nested class :
	If outer class and inner class variable name then inner class variable will beaccess with inner class object (Variable 
	Shadow bacause in the same scope), Ifwe want to access Outer class object from inner class then we need
	ClassName.this.variableName.
	 
 */

//Sample program on variable shadow problem in nested class.

class OuterClassDemo{
	
	private int data=100;
	
	class InnerClassDemo{
		
		private int data=200;
		
		public void printData()
		{
			System.out.println(OuterClassDemo.this.data);	// 1st Way
			System.out.println(new OuterClassDemo().data);	// 2nd Way
			System.out.println(this.data);
		}
		
	}
	
}

public class VariableShadowinNestedClassProgram03 {

	public static void main(String[] args) 
	{
		OuterClassDemo outer=new OuterClassDemo();
		OuterClassDemo.InnerClassDemo inner =outer.new InnerClassDemo();
		inner.printData();

	}

}
