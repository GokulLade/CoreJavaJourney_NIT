package com.nareshit.a_demoprograms;

import java.util.PriorityQueue;

class MyThread extends Thread
{
}

public class Demo{
	

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(20);
		p.add(44);
		p.add(12);
		p.add(89);
		p.add(7);
		
		System.out.println(p);//7,12,20,89,44
	}	
	
	
}