package com.nareshit.H_multithreading_in_java;

public class AnonymouseInnerWithRunnableProgram02 {

	public static void main(String[] args) {
		new Thread(new Runnable()
		{

			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Thread Name is :" + name);

			}
		}, "child-1").start();

	}

}
