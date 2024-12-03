package com.nareshit.D_java_support_concepts.E_record_class;


               //Canonical Constructor   +   Components
public record EmployeeRecord(int employeeId, String emloyeeName) {
	
	//Compact Constructor
		public EmployeeRecord
		{
			if(employeeId <= 0)
			{
				System.err.println("Id is Invalid");
			}
		}


}
