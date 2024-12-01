package com.nareshit.D_java_support_concepts.D_object_class_methods;

class Student
{
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName)
	{
		super();
		this.studentId = studentId; 
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student s2 = (Student) obj;
			if(this.studentId == s2.studentId && this.studentName.equals(s2.studentName))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			System.err.println("Comparison is not possible");
		}
		
		return false;
	}
		
}


class Manager{
	private int managerId; 
	private String managerName;
	
	public Manager(int managerId, String managerName)
	{
		this.managerId = managerId;
		this.managerName =managerName;
	}
}

public class EqualsMethodProgram04 {
	public static void main(String[] args) {
		Student s1 = new Student(222, "Scott");
		Student s2 = new Student(333, "Scott");
		Manager m1 = new Manager(222, "Scott");
		System.out.println(s1.equals(m1));
	}
}

