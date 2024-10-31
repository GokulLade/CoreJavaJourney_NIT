package com.nareshit.D_java_support_concepts.F_inner_classes;

class Laptop{
	public void laptopPartDetails()
	{
		System.out.println("Laptop Parts..!");
	}
}

public class AnonymousInnerClassProgram01 {

	public static void main(String[] args) 
	{
		Laptop laptopPart=new Laptop();
		laptopPart.laptopPartDetails();
		
		Laptop keyboard=new Laptop() 
		{
			@Override
			public void laptopPartDetails()
			{
				System.out.println("1.Keybord");
			}
		};
		keyboard.laptopPartDetails();
		
		Laptop mouse=new Laptop() 
		{
			@Override
			public void laptopPartDetails()
			{
				System.out.println("2.Mouse");
			}
		};
		mouse.laptopPartDetails();

	}

}
