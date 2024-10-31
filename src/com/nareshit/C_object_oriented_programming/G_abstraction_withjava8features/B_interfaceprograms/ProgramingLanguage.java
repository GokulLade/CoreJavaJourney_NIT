package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;


interface serverSideLanguage{
	public void companyName();
}

interface JavaLanguage extends serverSideLanguage{
	public void javaPrograming();
}

interface PhpLanguage extends serverSideLanguage{
	public void phpPrograming();
}

class AboutLag1 implements JavaLanguage{
	
	@Override
	public void companyName() {
		System.out.println("Oracle");
	}
	
	@Override
	public void javaPrograming() {
		System.out.println("James Gosling");
	}
}

class AboutLag2 implements PhpLanguage{
	
	@Override
	public void companyName() {
		System.out.println("WPWeb Infotech ");
	}
	
	@Override
	public void phpPrograming() {
		System.out.println("Rasmus Lerdorf ");
	}
}
public class ProgramingLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
