package com.nareshit.D_java_support_concepts.C_final_and_sealed_keword;

sealed class Bird permits Sparrot,Crow{
	
	public void fly() 
	{
		System.out.println("Bird Flying..!!");
	}
	
}

final class Sparrot extends Bird{
	
	@Override
	public void fly() 
	{
		System.out.println("Sparrot Flying..!!");
	}
	
}

final class Crow extends Bird{
	
	@Override
	public void fly() 
	{
		System.out.println("Crow Flying..!!");
	}
	
}

//Dog is not a Bird(Error)

/*
final class Dog extends Bird{
	
	@Override
	public void fly() 
	{
		System.out.println("Dog Flying..!!");
	}
}
*/
public class SealedProgarm01 {

	public static void main(String[] args) 
	{
		Bird sparrot=new Sparrot();
		sparrot.fly();
		
		Bird crow=new Crow();
		crow.fly();

	}

}
