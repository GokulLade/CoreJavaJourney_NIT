package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.B_StackClass;

import java.util.Stack;

public class InsertAndFetchElemntFromStackProgram01 {

	public static void main(String[] args) 
	{
		Stack<String> usernames=new Stack<>();
		
		String users[]= {"Gokul","Ganesh","Rushi","Vikram"};
		
		for(int i=0;i<users.length;i++)
		{
			usernames.push(users[i]);
		}

		System.out.println(usernames.size());
		
		System.out.println("Fetching the elements using pop method: ");
		System.out.println(usernames.pop());
		System.out.println(usernames.pop());
		System.out.println(usernames.pop());
		System.out.println(usernames.pop());
		
		System.out.println("After deletion elements are :"+usernames);
		
		
		System.out.println("Is the Stack empty ? :"+usernames.empty());
		
	}

}
