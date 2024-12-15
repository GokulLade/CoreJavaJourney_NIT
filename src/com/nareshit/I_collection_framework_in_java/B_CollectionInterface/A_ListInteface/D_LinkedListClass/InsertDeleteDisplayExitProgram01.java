package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.D_LinkedListClass;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertDeleteDisplayExitProgram01 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("LinkedList : "+list);
			
			System.out.println("1. Insert Elements ");
			System.out.println("2. Delete Elements ");
			System.out.println("3. Display Elements ");
			System.out.println("4. Exit Elements ");
			
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
						System.out.println("Enter the Elements to insert");
						int element=sc.nextInt();
						list.add(element);
						break;
						
				case 2:
						if (list.isEmpty()) 
						 {
		                      System.out.println("Linked list is empty. Nothing to delete.");
		                 } 
						else 
						{
	                      System.out.print("Enter the element to delete: ");
	                      int elemenetToDelete = sc.nextInt();
	                      boolean remove = list.remove(Integer.valueOf(elemenetToDelete));                     
	                      
	                       if(remove)
	                       {
	                    	   System.out.println("Element "+elemenetToDelete+ " is deleted Successfully" );
	                       }
	                       else
	                       {
	                    	   System.out.println(elemenetToDelete+" not available is the LinkedList");
	                       }
	                    
	                  }
	                  break;
	                  
				case 3:
					System.out.println("Elements in the linked list.");
                    list.forEach(System.out::println);
				    break;

				case 4:
					 System.out.println("Exiting the program.");
	                  sc.close();
	                  System.exit(0);
	             
				default:
	                  System.out.println("Invalid choice. Please try again.");

			}
		}
		

	}

}
