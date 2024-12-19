package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.C_SortedSetInterface;

import java.util.ArrayList;
import java.util.Collections;

record Employee(Integer id, String name, Double salary) implements Comparable <Employee>
{

	//Sorting Employee Object based on Employee Salary
	@Override
	public int compareTo(Employee e2) 
	{
		return this.salary.compareTo(e2.salary);
	}
	
}

public class ComparableInterfaceProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Employee> listOfEmployee=new ArrayList<>();
		listOfEmployee.add(new Employee(104,"Gokul",50000.00));
		listOfEmployee.add(new Employee(105,"Ganesh",70000.00));
		listOfEmployee.add(new Employee(102,"Rushi",30000.00));
		listOfEmployee.add(new Employee(103,"Vaibhav",660000.00));
		listOfEmployee.add(new Employee(101,"Vikram",80000.00));
		
		listOfEmployee.forEach((e)->System.out.println(e));
		System.out.println();
		Collections.sort(listOfEmployee);
		listOfEmployee.forEach((e)->System.out.println(e));

	}

}
