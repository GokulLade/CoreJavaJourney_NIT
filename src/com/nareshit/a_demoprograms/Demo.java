package com.nareshit.a_demoprograms;

interface ICollect{
	
}
class Collect{
	
	public static ICollect getObject()
	{
		return null;
	}
}

class Demo1{
	
	public void print(ICollect i)
	{
		
	}
}
public class Demo {

	public static void main(String[] args) 
	{
		Demo1 d= new Demo1();
		
		d.print(Collect.getObject());
	}

}