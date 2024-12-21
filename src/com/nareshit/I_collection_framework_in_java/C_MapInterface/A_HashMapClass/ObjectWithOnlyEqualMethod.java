package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Customer{
	private int id;
	private String name;
	
	public Customer(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class ObjectWithOnlyEqualMethod {

	public static void main(String[] args) 
	{
		Customer c1=new Customer(101, "Gokul");
		Customer c2=new Customer(101, "Gokul");
		
		Map<Customer,String> map=new HashMap<>();
		map.put(c1, "value1");
		map.put(c2, "value2");
		
		System.out.println(map.size()); //2
		System.out.println(map);//{}

	}

}
