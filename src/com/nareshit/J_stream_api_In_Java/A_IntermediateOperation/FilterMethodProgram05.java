package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

//Fetch all the Employees name whose salary is greater then 50k [Working with custom Object]
import java.util.stream.Stream;

record Employee(Integer empId, String empName, Double empSalary)
{
	
}

public class FilterMethodProgram05
{
	public static void main(String[] args) 
	{
	   Employee e1 = new Employee(111, "Juber", 90000D); 
	   Employee e2 = new Employee(222, "Aryan", 40000D); 
	   Employee e3 = new Employee(333, "Scott", 60000D); 
	   Employee e4 = new Employee(444, "Rahul", 70000D); 
	   Employee e5 = new Employee(555, "Aakash",85000D); 
	   Employee e6 = new Employee(666, "Manav", 92000D); 
	   Employee e7 = new Employee(666, "Manav", 92000D); 
 	
	   Stream<Employee> streamOfEmployees = Stream.of(e1,e2,e3,e4,e5,e6,e7);
	   
	   streamOfEmployees.filter(emp -> emp.empSalary()>50000).distinct().forEach(employee -> System.out.println(employee.empName()));
	   
	   
	}
}
