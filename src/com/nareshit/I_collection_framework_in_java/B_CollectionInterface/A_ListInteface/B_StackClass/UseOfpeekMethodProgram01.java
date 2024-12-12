package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.B_StackClass;

import java.util.Stack;

public class UseOfpeekMethodProgram01 {

	public static void main(String[] args)
	{
		Stack<String> stk= new Stack<>();  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		System.out.println("Stack: " + stk);  
		
		String fruit = stk.peek(); 			
		System.out.println("Element at top: " + fruit);  
		System.out.println("Stack elements are : " + stk); 


	}

}
