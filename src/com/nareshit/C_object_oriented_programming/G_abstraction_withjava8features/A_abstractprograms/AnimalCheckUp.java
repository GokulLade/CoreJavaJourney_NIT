package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.A_abstractprograms;

abstract class Animal{
	
	public abstract void checkup();
}

class Dog extends Animal{
	
	@Override
	public void checkup()
	{
		System.out.println("DogCheckup");
	}
}
class Lion extends Animal{
	
	@Override
	public void checkup()
	{
		System.out.println("LionCheckup");
	}
}
class Bird extends Animal{
	
	@Override
	public void checkup()
	{
		System.out.println("BirdCheckup");
	}
}

public class AnimalCheckUp {

	public static void main(String[] args) 
	{
		Lion []lions = {new Lion(), new Lion(), new Lion()};
		
		Dog []dogs = {new Dog(), new Dog()};
		
		Bird []birds = {new Bird(), new Bird(), new Bird(), new Bird() };
		
		checkAnimals(lions);
		checkAnimals(dogs);
		checkAnimals(birds);
		
	}
	
	public static void checkAnimals(Animal []animals)
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}

	}
}

