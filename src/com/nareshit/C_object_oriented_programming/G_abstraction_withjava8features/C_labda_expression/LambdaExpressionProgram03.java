package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.C_labda_expression;

@FunctionalInterface
interface StringOperation{
	int findLength(String str);
}
public class LambdaExpressionProgram03 {

	public static void main(String[] args) 
	{
		StringOperation s1=str->str.length();
		System.out.println(s1.findLength("Gokul"));

	}

}
