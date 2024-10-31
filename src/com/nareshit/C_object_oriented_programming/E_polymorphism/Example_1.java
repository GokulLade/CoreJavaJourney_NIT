package com.nareshit.C_object_oriented_programming.E_polymorphism;

class ParentClass{
	{
		System.out.println("Parent class non static block");
	}
	ParentClass(){
		System.out.println("Parent class constructor");
	}
	public static void m1() {
		System.out.println("Parent Class static method");
	}
	public void m2() {
		System.out.println("Parent class non Static method");
	}
}

class ChildClass extends ParentClass{
	{
		System.out.println("Child class non static block");
	}
	ChildClass(){
		super();
		System.out.println("Child class Constructor");
	}
	public static void m1() {
		System.out.println("Child class static method");
	}
	
	@Override
	 public void m2() {
		System.out.println("Child class non-static method");
	}
}


public class Example_1 {

	public static void main(String[] args) {
		
		ParentClass obj=new ChildClass();
		obj.m2();
	}

}
