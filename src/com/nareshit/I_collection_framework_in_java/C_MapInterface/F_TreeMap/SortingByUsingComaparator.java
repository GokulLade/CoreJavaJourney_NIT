package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.TreeMap;

record Employee(Integer empId, String employeeName)
{
	
}


public class SortingByUsingComaparator {

	public static void main(String[] args) 
	{
		TreeMap<Employee,String> tm1 = new TreeMap<>((e1,e2)-> e1.empId().compareTo(e2.empId()));
		tm1.put(new Employee(333, "Scott"), "London");
		tm1.put(new Employee(222, "Smith"), "Australia");
		tm1.put(new Employee(111, "Martin"), "England");

		System.out.println("Sorting By using ID :");
		System.out.println(tm1);
		
		TreeMap<Employee,String> tm2 = new TreeMap<>((e1,e2)-> e1.employeeName().compareTo(e2.employeeName()));
		tm2.put(new Employee(333, "Scott"), "London");
		tm2.put(new Employee(222, "Smith"), "Australia");
		tm2.put(new Employee(111, "Martin"), "England");

		System.out.println("Sorting By using Name :");
		System.out.println(tm2);
	}

}