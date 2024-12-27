package com.nareshit.D_java_support_concepts.J_working_with_generics;

abstract class Animal
{
	public abstract void checkup();
}

class Dog1 extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Dog checkup");
	}
}

class Cat extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Cat checkup");
	}
}

class Bird extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}


public class PolymorphismWithArrayProgram {
	
	public void checkAnimals(Animal animals[]) 
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

	public static void main(String[] args) 
	{
		Dog1 []dogs={new Dog1(), new Dog1()};

		Cat []cats={new Cat(), new Cat(), new Cat()};

		Bird []birds = {new Bird(), new Bird()};

		PolymorphismWithArrayProgram t = new PolymorphismWithArrayProgram();

		t.checkAnimals(dogs);
		t.checkAnimals(cats);
		t.checkAnimals(birds);
	}


}
