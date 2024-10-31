package com.nareshit.a_demoprograms;

class Student{
	String name;
	int age;
	Address ad;
	
	public Student(String name, int age, Address ad) {
		super();
		this.name = name;
		this.age = age;
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Student \n name : " + name + "\n age :" + age;
	}
	
}

class Address{
	String streetName;
	String state;
	String city;
	long pincode;
	public Address(String streetName, String state, String city, long pincode) {
		this.streetName = streetName;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address: \nstreetName : " + streetName + "\nstate : " + state + "\ncity :" + city + "\npincode :" + pincode;
	}
}

public class MainClass1 {

	public static void main(String[] args) {
		Address a1=new Address("Ammerpeth","Telegana","Hyderabad",500016L);
		Student s1 =new Student("Gokul", 21,a1);
		
		System.out.println(s1);
	}

}
