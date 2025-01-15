package com.nareshit.a_demoprograms;

import java.util.function.Consumer;

class StaticDemo{
	
	public static void print(String msg)
	{
		System.out.println(msg);
	}
	
	public void print(int i1)
	{
		System.out.println(i1+"  ");
	}
}

public class Demo {

	public static void main(String[] args) 
	{
		Consumer<String> cm=StaticDemo::print;
		cm.accept("Hello");
		
		StaticDemo sd=new StaticDemo();
		Consumer<Integer> i=sd::print;
		i.accept(12);
	}

}