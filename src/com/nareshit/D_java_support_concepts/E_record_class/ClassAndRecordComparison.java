package com.nareshit.D_java_support_concepts.E_record_class;

public class ClassAndRecordComparison {

	public static void main(String[] args)
	{
		EmployeeClass c1 = new EmployeeClass(111, "Scott");
		System.out.println(c1);
		EmployeeClass c2 = new EmployeeClass(111, "Scott");
		System.out.println(c1.equals(c2));
		System.out.println(c1.getEmployeeName());
		
		
		System.out.println("==========================");
		
		EmployeeRecord r1 = new EmployeeRecord(-222, "Smith");
		System.out.println(r1);
		EmployeeRecord r2 = new EmployeeRecord(222, "Smith");
		System.out.println(r1.equals(r2));
		System.out.println(r1.emloyeeName());


	}

}
