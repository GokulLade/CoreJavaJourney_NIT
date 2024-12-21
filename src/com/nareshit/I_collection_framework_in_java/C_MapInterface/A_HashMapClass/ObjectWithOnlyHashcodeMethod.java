package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) 
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name, rollNo);
	}

	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

public class ObjectWithOnlyHashcodeMethod {

	public static void main(String[] args) 
	{
		Student s1=new Student(101,"Gokul");
		Student s2=new Student(101,"Gokul");
		
		Map<Student,String> map=new HashMap<>();
		map.put(s1, "Value1");
		map.put(s2, "Value2");
		
		System.out.println(map.size());// 2
		System.out.println(map);

	}

}
