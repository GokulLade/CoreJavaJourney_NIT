package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.
D_predefined_functional_interface;

import java.util.function.Consumer;

public class ConsumerProgram01 {

	public static void main(String[] args) 
	{
		String s="NareshItechnology";
		
		Consumer<String> findCharCount=str->
		{
			str=str.toLowerCase();
			char arr[]=str.toCharArray();
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]=='*')
				{
					continue;
				}
				
				int count=1;
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]='*';
					}
				}
				
				System.out.println("The "+arr[i] +" Char present "+count+" Times");
				
			}
		};
		
		findCharCount.accept(s);
	}

}
