package com.nareshit.D_java_support_concepts.E_record_class;

import java.util.Objects;

public class EmployeeClass {

	private Integer employeeId;
	private String employeeName;
	
	public EmployeeClass(Integer employeeId, String employeeName)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() 
	{
		return employeeId;
	}

	public String getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeId(Integer employeeId) 
	{
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	@Override
	public String toString() 
	{
		return "EmployeeClass [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(employeeId, employeeName);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName);
	}
	
}
