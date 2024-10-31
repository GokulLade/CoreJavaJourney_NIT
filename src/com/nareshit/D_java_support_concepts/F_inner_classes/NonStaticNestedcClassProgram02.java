package com.nareshit.D_java_support_concepts.F_inner_classes;

/*
 Non static Nested class :
  ->If a non static class declared inside the another class but outside of themethod then it is called non static nested
	class.
	
  ->We can apply private, default, protected, public, abstract and final modifierson non static nested class.
	With the help of outer class we can load inner class also, If inner class contains non static member then object is 
	required for Outer class as well asinner class.
	
  ->Inner class we can't represent directly, we need to take the support of Outerclass because inner class is a non static
	member of Outer class.
	
  ->It is also known as Regular OR Member class.
 
 */

// Sample code of Non static Nested class
class OuterClass{
	
	private int data=100;
	
	class InnerClass{
		
		public void printData() 
		{
			System.out.println("The Outer class Data is : "+data);
		}
		
	}
}

public class NonStaticNestedcClassProgram02 {
	

	public static void main(String[] args) 
	{
//		OuterClass.InnerClass inner=new OuterClass().new InnerClass();
//		inner.printData();
		
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.printData();

	}

}
