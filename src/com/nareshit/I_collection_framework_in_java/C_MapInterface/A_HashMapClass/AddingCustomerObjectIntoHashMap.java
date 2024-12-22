package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.HashMap;

record Employee(Integer empId, String empName)
{
	
}

public class AddingCustomerObjectIntoHashMap 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Aryan");
		Employee e2 = new Employee(102,"Pooja");
		Employee e3 = new Employee(101,"Aryan");
		Employee e4 = e2;  
		
		HashMap<Employee,String> hm = new HashMap<>();
		hm.put(e1,"Ameerpet");
		hm.put(e2,"S.R Nagar");
		hm.put(e3,"Begumpet");
		hm.put(e4,"Panjagutta");

		hm.forEach((k,v)-> System.out.println(k+" : "+v));
	}
}

