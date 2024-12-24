package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.TreeMap;

record Product(Integer pid,String pname) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p1) 
	{
		return this.pid.compareTo(p1.pid);
	}
	
}

public class SortingKeyUsingComparableInterface {

	public static void main(String[] args) 
	{
		TreeMap<Product,String> map=new TreeMap<>();
		map.put(new Product(103,"Laptop"), "Hyderabad");
		map.put(new Product(102,"Mouse"), "Pune");
		map.put(new Product(101,"TV"), "Nagpur");
		map.put(new Product(104,"Mobile"), "Mumbai");
	
		System.out.println(map);

	}

}
