package com.nareshit.D_java_support_concepts.F_inner_classes;

class Product{
	class Clothing{
		String brand,color;
		int size;
		double price;
		double discount1=5.0;
		
		public Clothing(String brand, String color, int size, double price) {
			this.brand = brand;
			this.color = color;
			this.size = size;
			this.price = price;
		}

		public double calculateDiscount(double discount) {
			return price-(price*(discount/100));
			
		}
		
		public void displayDetail() {
			System.out.println("Brand is "+ brand +"\nColor is "+color+"\nSize is "+size+"\nprice is "+price+"\nWith Discount price is "+calculateDiscount(discount1));
		}
		
	}
	
	class Laptop{
		String brand, processor, ram, storage;
		int price;
		int warranty;
		public Laptop(String brand, String processor, String ram, String storage, int price,int warranty) {
			this.brand = brand;
			this.processor = processor;
			this.ram = ram;
			this.storage = storage;
			this.price = price;
			this.warranty=warranty;
		}
		
		public double calculateExtendedPrice(int warrantyYear)
		{
			return price-warrantyYear*(10.0/100);
		}
		public void displayDetails() {
			System.out.println("\nBrand :"+brand+"\nProcessor :"+processor+"\nRam :"+ram+"\nStorage :"+storage+"\nPrice :"+price+"\nPrice with warranty :"+calculateExtendedPrice(warranty));
			
		}
	}

	
}

public class Example1 {
	public static void main(String[] args) {
		Product p=new Product();
		Product.Clothing c=p.new Clothing("One8","Red",36,12000);
		c.displayDetail();
		
		Product.Laptop l=p.new Laptop("DELL","i3","8GB","512GB_SSD",46000,2);
		l.displayDetails();
	}
	
}

