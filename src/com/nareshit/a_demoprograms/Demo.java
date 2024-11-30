package com.nareshit.a_demoprograms;

import java.util.function.*;
@FunctionalInterface
interface Test{
	void print();
}

public class Demo{
	
	public static void main(String[] args) 
	{
		BiConsumer<Integer, Integer> b= (num1,num2) -> System.out.println("Sum "+(num1+num2));
		b.accept(10, 10);
	}
}