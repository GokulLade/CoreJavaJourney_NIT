package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.B_StackClass;

import java.util.Stack;

public class SearchingElementsInStackProgram01 {

	public static void main(String[] args) 
	{
		Stack<String> stk= new Stack<>();  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango"); 			
		System.out.println("Offset Position is : " + stk.search("Mango")); //1			
		System.out.println("Offser Position is : " + stk.search("Banana")); //-1
	    System.out.println("Is stack empty ? "+stk.empty());	//false
		
		System.out.println("Index Position is : " + stk.indexOf("Mango")); //2

	}

}