package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


record Product(int productId, String productName)
{
	
}

public class EnumarationToIteratorProgram01 {

		public static void main(String[] args) 
		{
			Vector<Product> listOfProduct = new Vector<>();
			listOfProduct.add(new Product(111, "Laptop"));
			listOfProduct.add(new Product(222, "Mobile"));
			listOfProduct.add(new Product(333, "Camera"));
			listOfProduct.add(new Product(444, "Bag"));
			listOfProduct.add(new Product(555, "Watch"));
			
			Enumeration<Product> elements = listOfProduct.elements();
			
			//Enumeration to Iterator convertion
			Iterator<Product> asIterator = elements.asIterator();
			asIterator.forEachRemaining(System.out::println);
			          
		}

	}


