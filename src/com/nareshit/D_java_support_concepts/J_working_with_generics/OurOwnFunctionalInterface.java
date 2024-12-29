package com.nareshit.D_java_support_concepts.J_working_with_generics;

interface TriFunction<T,U,V,R>
{
	public abstract R apply(T a, U b, V c);
}


public class OurOwnFunctionalInterface {

	public static void main(String[] args) 
	{
		TriFunction<Integer,Integer,Integer,String> t1 = (a,b,c)-> 
		a+b+c+"";
		
		System.out.println(t1.apply(100, 200, 300));

	}

}


