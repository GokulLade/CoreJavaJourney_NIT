package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.stream.Stream;

record Sale(String item, Double amount)
{
	
}


public class ReduceMethodProgram05 {

	public static void main(String[] args) 
	{
		Stream<Sale> sales = Stream.of(new Sale("Camera", 10000.0), new Sale("Mobile", 50000.0), new Sale("Laptop", 80000.0));

		Double totalSale = sales.reduce(0.0, (sum, sale) -> sum + sale.amount(), Double::sum);

		System.out.println(totalSale);

	}

}
