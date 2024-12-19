package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.D_TreeSetClass;

import java.util.Set;
import java.util.TreeSet;

record Product(Integer productId, String productName)
{
	
}

public class CustomerDataSordingUsingTreeSet
{
   public static void main(String[] args) 
   {
	
	   System.out.println("Sorting data in Ascending order based on Product Id ");
	   Set<Product> products = new TreeSet<Product>((p1,p2)-> p1.productId().compareTo(p2.productId()));
	   products.add(new Product(111, "Mobile"));
	   products.add(new Product(444, "Camera"));
	   products.add(new Product(222, "Laptop"));
	   products.add(new Product(333, "Keyboard"));
	   
	   products.forEach(System.out::println);
	   System.out.println();
	   
	   System.out.println("Sorting data in Descending order based on Product Id ");
	   Set<Product> products1 = new TreeSet<Product>((p1,p2)-> p2.productId().compareTo(p1.productId()));
	   products1.add(new Product(111, "Mobile"));
	   products1.add(new Product(444, "Camera"));
	   products1.add(new Product(222, "Laptop"));
	   products1.add(new Product(333, "Keyboard"));
	   
	   products1.forEach(System.out::println);
	   System.out.println();
	   
	   System.out.println("Sorting data in Ascending order based on Product Name ");
	   Set<Product> products2 = new TreeSet<Product>((p1,p2)-> p1.productName().compareTo(p2.productName()));
	   products2.add(new Product(111, "Mobile"));
	   products2.add(new Product(444, "Camera"));
	   products2.add(new Product(222, "Laptop"));
	   products2.add(new Product(333, "Keyboard"));
	  
	   products2.forEach(System.out::println);
	   System.out.println();
	   
	   System.out.println("Sorting data in Descending order based on Product Name ");
	   Set<Product> products3 = new TreeSet<Product>((p1,p2)-> p2.productName().compareTo(p1.productName()));
	   products3.add(new Product(111, "Mobile"));
	   products3.add(new Product(444, "Camera"));
	   products3.add(new Product(222, "Laptop"));
	   products3.add(new Product(333, "Keyboard"));
	   
	   products3.forEach(System.out::println);
	   

   }
}

