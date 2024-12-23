package com.nareshit.I_collection_framework_in_java.C_MapInterface.D_WeakHashMap;

import java.util.WeakHashMap;

record Product(Integer productId, String productName)
{
	@Override
	public void finalize()
	{
		System.out.println("Object is ready for GC");
	}
	
}

public class AdddingProductObjectIntoWeakHashMap {

	public static void main(String[] args) throws InterruptedException 
	{
		Product p1=new Product(101, "Mouse");
		WeakHashMap<Product,String> hm=new WeakHashMap<Product, String>();
		
		hm.put(p1,"Hyderabad");
		
		System.out.println(hm);
		
		p1=null;
		System.gc();
		
		Thread.sleep(3000);
		
		System.out.println(hm);

	}

}
