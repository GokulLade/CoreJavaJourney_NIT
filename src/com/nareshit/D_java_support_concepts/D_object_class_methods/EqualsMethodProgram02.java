package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Customer{
	
	private int cid;
	private String cname;
	
	public Customer(int cid,String cname)
	{
		this.cid=cid;
		this.cname=cname;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		//retriave data from parameter object
		Customer c=(Customer)obj;
		
		if(this.cid==c.cid && this.cname.equals(c.cname))
		{
			return true;
		}
		
		return false;
	}
}
 	
public class EqualsMethodProgram02 {

	public static void main(String[] args)
	{
		Customer c1=new Customer(101, "Gokul");
		Customer c2=new Customer(101, "Gokul");
		
		System.out.println(c1.equals(c2)); //true

	}

}
