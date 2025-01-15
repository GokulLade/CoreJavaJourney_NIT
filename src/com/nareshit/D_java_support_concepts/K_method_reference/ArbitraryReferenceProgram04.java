package com.nareshit.D_java_support_concepts.K_method_reference;

@FunctionalInterface
interface MyInterface<T,U,V,R>
{
   R myApply(T t, U u, V v);	
}

class Addition
{
	public Integer doSum(String s1, String s2)
	{
		return Integer.parseInt(s1) + Integer.parseInt(s2);
	}
}

public class ArbitraryReferenceProgram04
{
	public static void main(String[] args) 
	{
		//By Using Lambda
		MyInterface<Addition, String, String, Integer> fn1 = (a, u, v)-> a.doSum(u, v);		
	System.out.println("Sum is :"+fn1.myApply(new Addition(), "100", "200"));
		
	   //By using Method Reference
	   MyInterface<Addition, String, String, Integer> fn2 = Addition::doSum;
	   System.out.println("Sum is :"+fn2.myApply(new Addition(), "400", "500"));
	
	
	}

}
