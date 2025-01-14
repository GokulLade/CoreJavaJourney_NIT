package com.nareshit.D_java_support_concepts.K_method_reference;

import java.util.Arrays;
import java.util.function.Function;

class Person 
{
    private String name;   

    public Person(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
    
    
}

public class ConstructorReferenceProgram03
{
    public static void main(String[] args) 
    {
    	Function<Integer,Person[]> fn2 = Person[]::new;
    	
        Person[] persons = fn2.apply(3); // 3 is the size of the Array
        
        persons[0] = new Person("A");
        persons[1] = new Person("B");
        persons[2] = new Person("C");
        
        System.out.println(Arrays.toString(persons));
    	
    }
}
