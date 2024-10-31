package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms.A_loosecouplingProgram;

public class MainClass {

	public static void main(String[] args) 
	{
		
		
		Restaturant.acceptObject(new Tea());
		Restaturant.acceptObject(new Coffee());
		Restaturant.acceptObject(new Horlicks());
	}

}
