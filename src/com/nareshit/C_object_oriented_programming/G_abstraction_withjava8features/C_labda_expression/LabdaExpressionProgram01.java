package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.C_labda_expression;

@FunctionalInterface
interface Showable{
	void show();
}

public class LabdaExpressionProgram01 {

	public static void main(String[] args) 
	{
		Showable sh=()-> System.out.println("Show Method..!");
		sh.show();
	}

}
