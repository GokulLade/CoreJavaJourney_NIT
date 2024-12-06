package com.nareshit.a_demoprograms;

import java.util.Arrays;

//Q3. Given an array of integers length 3, return an array with the elements 
//	  "rotated left" so {1, 2, 3} will become  {2, 3, 1}. 

public class Demo{
	
	public static int[] rotatedElement(int arr[])
	{
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		return new int[] {arr[0],arr[1],arr[2]};
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3}; // => 2 3 1
		
		System.out.println("Rotated Element is "+ Arrays.toString(rotatedElement(arr)));
	}	
}