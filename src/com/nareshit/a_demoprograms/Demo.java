package com.nareshit.a_demoprograms;

import java.util.Optional;

class Employee{
	
	private Integer sal;
	
	public Integer getSalary()
	{
		return this.sal;
	}
}

public class Demo {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		System.out.println(e.getSalary());
		
		Optional<Employee> name = Optional.of(e);
		if(name.isPresent())
		{
			System.out.println(name.get());
		}
	}

}