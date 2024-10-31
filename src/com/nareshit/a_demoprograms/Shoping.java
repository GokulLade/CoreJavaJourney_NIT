package com.nareshit.a_demoprograms;

class Order{
	private String orderId;
	private String productName;
	public Order(String orderId, String productName) {
		if(orderId.startsWith("0") || orderId.startsWith("-")){
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		else if(productName.startsWith("-") || productName.startsWith("0")) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		else {
			this.orderId=orderId;
			this.productName=productName;
		}
	}
	public String getOrderId() {
		return orderId;
	}
	public String getProductName() {
		return productName;
	} 
	@Override
	public String toString() {
		return "\nOrder Id=" + orderId + "\nProduct Name=" + productName;
	}
	
}
class Customer{
	private String name;
	private String email;
	private Order order;
	
	public Customer(String name,String email, Order order) {
		if(name.startsWith("0") || name.startsWith("-")){
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		else if(email.startsWith("-") || email.startsWith("0")) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		else {
			this.name=name;
			this.email=email;
			this.order=order;
		}
	}

	@Override
	public String toString() {
		return "\nCustomer name=" + name + "\nEmail=" + email + " " + order;
	}
	
}

public class Shoping {

	public static void main(String[] args) {
		Order o1=new Order("102","Cake");
		Customer c1=new Customer("Gokul","xyz89@gmail.com",o1);
		
		System.out.println(c1);
	}

}
