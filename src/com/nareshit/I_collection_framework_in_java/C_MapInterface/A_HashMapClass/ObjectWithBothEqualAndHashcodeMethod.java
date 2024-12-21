package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.HashMap;
import java.util.Objects;

class Customer1
{
	private int customerId;
	private String customerName;
	
	public Customer1(int customerId, String customerName) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer1 other = (Customer1) obj;
		return customerId == other.customerId && Objects.equals(customerName, other.customerName);
	}

	
}
public class ObjectWithBothEqualAndHashcodeMethod 
{

	public static void main(String[] args) 
	{
	   Customer1 c1 = new Customer1(111, "Scott");	
	   Customer1 c2 = new Customer1(111, "Scott");	
	   	   
	   System.out.println(c1.hashCode()+" : "+c2.hashCode());
	    
	   HashMap<Customer1,String> map = new HashMap<>();
	   map.put(c1, "A");  //c1   B
	   map.put(c2, "B");
	   
	   System.out.println(map.size());
	}

}
