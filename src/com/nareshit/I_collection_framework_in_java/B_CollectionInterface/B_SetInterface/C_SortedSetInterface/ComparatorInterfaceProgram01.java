package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.C_SortedSetInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

record Product(Integer pId, String pName, Double pPrice)
{
	
}

public class ComparatorInterfaceProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product(222, "Camera", 52000D));
		listOfProducts.add(new Product(111, "Laptop", 82000D));
		listOfProducts.add(new Product(444, "Mobile", 65000D));
		listOfProducts.add(new Product(333, "Headphone", 2000D));
		
		listOfProducts.forEach(System.out::println);
		System.out.println();
		
		//Sorting the product based on the product id
		Comparator<Product> sortid=new Comparator<>() {

			@Override
			public int compare(Product p1, Product p2) 
			{
				return p1.pId().compareTo(p2.pId());
			}

			
		};
		Collections.sort(listOfProducts,sortid);
		listOfProducts.forEach(System.out::println);
		
		System.out.println();
		
		//Sort the Product data based on the Product Name
		Collections.sort(listOfProducts,(p1,p2)->p1.pName().compareTo(p2.pName()));
		listOfProducts.forEach(System.out::println);

	}

}
