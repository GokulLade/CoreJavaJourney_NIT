package com.nareshit.H_multithreading_in_java;

class GetCube{
	public void getCube(int num)
	{
		System.out.println("The Cube of Numer "+num+" is "+ (num*num*num));
	}
}

public class AssignDifferentTaskToDifferentThreadProgram01 {

	public static void main(String[] args) 
	{
		GetCube gc=new GetCube();
		
		new Thread(){
			@Override
			public void run()
			{
				gc.getCube(10);
			}
		}.start();
		
		new Thread(){
			@Override
			public void run()
			{
				gc.getCube(20);
			}
		}.start();

	}

}
