package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;
import java.util.List;

abstract class Animal1
{
	public abstract void checkup();
}

class Dog2 extends Animal1
{
    @Override
	public void checkup()
	{
		System.out.println("Dog checkup");
	}
}

class Cat1 extends Animal1
{
	@Override
	public void checkup()
	{
		System.out.println("Cat checkup");
	}
}
class Bird1 extends Animal1
{
	@Override
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}
public class PolymorphismWithGenericsProgram
{
	public void checkAnimals(List<Animal1> animals)  
	{
		for(Animal1 animal : animals)
		{
             animal.checkup();
		}
	}
	public static void main(String[] args) 
	{
		List<Dog2> dogs = new ArrayList<>();
		dogs.add(new Dog2());
		dogs.add(new Dog2());

		List<Cat1> cats = new ArrayList<>();
		cats.add(new Cat1());
		cats.add(new Cat1());

		List<Bird1> birds = new ArrayList<>();
		birds.add(new Bird1());
		
		PolymorphismWithGenericsProgram t = new PolymorphismWithGenericsProgram();
//		t.checkAnimals(dogs);  Compilation error
//		t.checkAnimals(cats);
//		t.checkAnimals(birds);

	}
}

