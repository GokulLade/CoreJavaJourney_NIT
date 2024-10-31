package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface Human{
	
	public void eat();
}

interface Boy extends Human{
	public int sleepTime();
}
public class Student implements Boy {
	public int classTime;
	
	Student(int classTime){
		this.classTime=classTime;
	}
	
	@Override
	public void eat() {
		System.out.println("Student Eat Hostel Food");
	}
	
	@Override
	public int sleepTime() {
		int otherWork=7;
		return (24-otherWork)-classTime;
	}

	public static void main(String[] args) {
		Student s1 =new Student(10);
		
		s1.eat();
		int sleepTime=s1.sleepTime();
		
		System.out.println("Student Sleep Time is :"+ sleepTime);	
	}

}
