package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Finding the Cheapest Product

record Product(Integer productId, String productName, Double productPrice)
{
	
}


public class MinMethodProgram02 {

	public static void main(String[] args)
	{
		var p1 = new Product(111, "Camera", 45000D);
		var p2 = new Product(222, "Watch", 23000D);
		var p3 = new Product(333, "HeadPhone", 2000D);
		
		List<Product> listOfProduct = List.of(p1,p2,p3);
		
		Optional<Product> min = listOfProduct.stream().min(Comparator.comparingDouble(Product::productPrice));
		
		if (min.isPresent())
		{
            System.out.println("The cheapest product is: " + min.get());
        } 
		else 
        {
            System.out.println("No products found.");
        }
		
	}

}
