package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.D_TreeSetClass;

import java.util.TreeSet;

record Employee(Integer eid) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e) 
	{
		return this.eid().compareTo(e.eid());
	}
	
}

public class AddingCustomerObjectIntoTreeSet {

	public static void main(String[] args) 
	{
		TreeSet<Employee> e=new TreeSet<>();
		e.add(new Employee(444));
		e.add(new Employee(111));
		e.add(new Employee(333));
		e.add(new Employee(222));
		e.add(new Employee(555));
		
		e.forEach(System.out::println);
		

	}

}
