package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employee1(Integer empId, String empName, double salary, Department dept)
{
	
}

record Department(Integer deptId, String deptName)
{	
}


public class GroupingByMethodProgram03 {

	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(111, "A", 23789.89, new Department(1, "IT"));
		Employee1 e2 = new Employee1(222, "B", 23789.89, new Department(1, "IT"));
		Employee1 e3 = new Employee1(333, "C", 23789.89, new Department(2, "Sales"));
		Employee1 e4 = new Employee1(444, "D", 23789.89, new Department(2, "Sales"));
		
		List<Employee1> list = List.of(e1,e2,e3,e4);
		
		
		HashMap<Department,List<Employee1>> map = new HashMap<>();
		map.put(new Department(1, "IT"), list);
		map.put(new Department(2, "Sales"), list);
		
     	Map<Department, List<Employee1>> collect = list.stream().collect(Collectors.groupingBy(Employee1::dept));
     	
     	collect.forEach((key, value) -> 
        {
            System.out.println(key + ": " + value);
        });		


	}

}
