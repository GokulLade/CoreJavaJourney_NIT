package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.C_labda_expression;

@FunctionalInterface
interface Calculation
{
	int doSum(int a,int b);
}


public class LabdaExpressionProgram02 {

	public static void main(String[] args) 
	{
		Calculation c1=(num1,num2)->num1+num2;
		
		System.out.println("Addition is :"+ c1.doSum(10,20));

	}

}
