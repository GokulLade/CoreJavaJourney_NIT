package com.nareshit.D_java_support_concepts.J_working_with_generics;


class Fruit
{
	
}
class Apple extends Fruit
{

	@Override
	public String toString() 
	{
		return "Apple";
	}
	
}
class Mango extends Fruit
{
	@Override
	public String toString() 
	{
		return "Mango";
	}
}

class Basket<E>  //E is Fruit Type
{
	private E element;

	public Basket(E element) // Fruit element = new Mango();
	{
		super();
		this.element = element;
	}

	public E getData() 
	{
		return element;
	}	
	
}

public class IndependentDataTypeProgram02
{
   public static void main(String[] args) 
   {
	  Basket<Fruit> basket = new Basket<>(new Apple());
	  Apple apple = (Apple) basket.getData();
	  System.out.println(apple);
	  
	  basket = new Basket<>(new Mango());
	  Mango mango = (Mango)basket.getData();
	  System.out.println(mango);
	  
	  
   }
}
