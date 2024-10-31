package com.nareshit.a_demoprograms;

class Animal{
	public void sleep() 
	{
		System.out.println("Animal is Sleeping..!!");
	}
}

class Dog extends Animal{
	@Override
	public void sleep() 
	{
		System.out.println("Dog is Sleeping..!!");
	}
	
	public void bark() 
	{
		System.out.println("Dog is Barking..!!");
	}
	
}
class Cat extends Animal{
	@Override
	public void sleep() 
	{
		System.out.println("Cat is Sleeping..!!");
	}
	
	public void mau() 
	{
		System.out.println("Cat is mau mau..!!");
	}
	
}

class Tiger extends Animal{
	@Override
	public void sleep() 
	{
		System.out.println("Tiger is Sleeping..!!");
	}
	
	public void roar() 
	{
		System.out.println("Tiger is roaring..!!");
	}
	
}

public class InstanceofOperatorInJava {
	
	public static void callingMethod(Animal a) 
	{
		if(a instanceof Dog) 
		{
			Dog dog=(Dog)a;
			dog.sleep();
			dog.bark();
		}
		
		else if(a instanceof Cat)
		{
			Cat cat=(Cat)a;
			cat.sleep();
			cat.mau();
		}
		
		else if(a instanceof Tiger)
		{
			Tiger tiger=(Tiger)a;
			tiger.sleep();
			tiger.roar();
		}
		
	}

	public static void main(String[] args) 
	{
		Animal dog=new Dog();
		Animal cat=new Cat();
		Animal tiger=new Tiger();
		
		callingMethod(dog);
		callingMethod(cat);
		callingMethod(tiger);

	}

}
