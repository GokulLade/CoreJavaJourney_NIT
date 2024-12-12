package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization)
{
	
}

class Department 
{
	private String departmentName;
	private List<Professor> professors;
	
	public Department(String departmentName) 
	{
		super();
		this.departmentName = departmentName;
		this.professors = new ArrayList<Professor>();  //Composition
	}
	
	public void addProferssor(Professor professor)
	{
		professors.add(professor);  
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

		
}

public class DepartmentAndProfessorsProgram01
{
    public static void main(String[] args) 
    {
       Department department = new Department("Computer Science");
       
       department.addProferssor(new Professor("James", "Java"));
       department.addProferssor(new Professor("Martin", "Python"));
       department.addProferssor(new Professor("Scott", ".Net"));
       department.addProferssor(new Professor("Smith", "Adv. Java"));
       
       System.out.println("Department Name is :"+department.getDepartmentName());
       System.out.println("Professors in :"+department.getDepartmentName());
       
       List<Professor> ListOfProfessors = department.getProfessors();
       ListOfProfessors.forEach(System.out::println);
       
      
    }
}

