package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;


interface LaptopName{
	public void name();
}
interface LaptopStorage extends LaptopName{
	public void ssdStorage(); 
}
interface LaptopChargeTime extends LaptopStorage{
	public void chargeTime();
}
public class Laptop implements LaptopChargeTime{
	
	@Override
	public void name() {
		System.out.println("DELL");
	}
	@Override
	public void ssdStorage() {
		System.out.println("Storage In SSD is 512GB");
		
	}
	@Override
	public void chargeTime() {
		System.out.println("The Charging Time of DELL Laptop is 7hr");
		
	}

	public static void main(String[] args) {
		Laptop t1=new Laptop();
		t1.name();
		t1.ssdStorage();
		t1.chargeTime();

	}

}
