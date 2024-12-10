package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.Vector;

record Employee(Integer eid, String employeeName, double employeeSal)
{
	
}

public class AddingEmployeeDataInVectorProgram01
{
  public static void main(String[] args) 
  {
	Vector<Employee> listOfEmployee = new Vector<>();
	listOfEmployee.add(new Employee(111, "Scott", 40000));
	listOfEmployee.add(new Employee(222, "Smith", 50000));
	listOfEmployee.add(new Employee(333, "Scott", 55000));
	listOfEmployee.add(new Employee(444, "Scott", 60000));
	
	
	listOfEmployee.forEach(emp -> System.out.println(emp));
	
  }
}
