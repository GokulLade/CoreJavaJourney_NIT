package com.nareshit.H_multithreading_in_java;

public class AnonymousInnerClassThreadProgarm01 {

	public static void main(String[] args) 
	{
		Thread t=new Thread() {
			
			@Override
			public void run()
			{
				
				System.out.println("Create Sub class of Thread class Using inne class Concept");
			}
		};
		t.start();
		

	}

}
