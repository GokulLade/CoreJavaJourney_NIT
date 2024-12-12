package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;
import java.util.Scanner;

record Customer(Integer id,String name)
{
	
}

public class AddingCustomerDataInToArrayListProgram01 {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Customer you want to add");
		int customers=sc.nextInt();
		
		ArrayList<Customer> list=new ArrayList<>(customers);
		
		int cid;
		String name;
		for(int i=1;i<=customers;i++)
		{
			System.out.println("Enter the Customer id: ");
			cid=sc.nextInt();sc.nextLine();
			System.out.println("Enter the customer name: ");
			name=sc.nextLine();
			
			list.add(new Customer(cid, name));
		
		}

		System.out.println("Customer are: ");
		list.forEach(System.out::println);
	}

}
