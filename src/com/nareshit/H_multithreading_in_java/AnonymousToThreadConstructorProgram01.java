package com.nareshit.H_multithreading_in_java;

public class AnonymousToThreadConstructorProgram01 {

	public static void main(String[] args)
	{
		new Thread(()->System.out.println(Thread.currentThread().getName()),"Child-1").start();
	}

}
