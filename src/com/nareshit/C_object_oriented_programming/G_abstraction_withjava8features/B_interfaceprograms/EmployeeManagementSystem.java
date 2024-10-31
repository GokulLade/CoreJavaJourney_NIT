package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface Employee{
	public double calculateSalary();
	public void generatePayroll();
}

class FullTimeEmployee implements Employee{
	private int employeeId;
	private String name;
	private double monthlySalary;
	private double benefits;
	
	FullTimeEmployee(int employeeId,String name,double monthlySalary,double benefits){
		this.employeeId=employeeId;
		if(name.equals("")) {
			System.out.println("Employee name cannot be empty.");
			System.exit(0);
		}
		else {
			this.name=name;
		}
		this.name=name;
		if(monthlySalary<0) {
			System.out.println("Monthly salary cannot be negative.");
				System.exit(0);
		}
		else {
			this.monthlySalary=monthlySalary;
		}
		this.benefits=benefits;
		
	}
	@Override
	public double calculateSalary() {
		return monthlySalary+benefits;
	}
	@Override
	public void generatePayroll() {
		System.out.println("Employee ID :"+employeeId);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Monthly Salary is :"+monthlySalary);
		System.out.println("Employee benefits is:"+ benefits);
		System.out.println("Employee Salary is:"+calculateSalary());
	}
	
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
	
		FullTimeEmployee e1=new FullTimeEmployee(101,"",50_000,5000);
		e1.generatePayroll();

	}

}
