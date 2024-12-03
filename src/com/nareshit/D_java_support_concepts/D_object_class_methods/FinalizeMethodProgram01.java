package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Product{
	
	private Integer productId;
	private String productName;
	
	public Product(Integer productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	@Override
	protected void finalize()
	{
		System.out.println("Project object is eligible for GC");
	}
	
	
}

public class FinalizeMethodProgram01 {

	public static void main(String[] args) throws InterruptedException 
	{
		Product p=new Product(101, "Laptop");
		System.out.println(p);
		
		p=null;
		System.gc();
		
		Thread.sleep(3000);
		
		System.out.println(p);

	}

}
