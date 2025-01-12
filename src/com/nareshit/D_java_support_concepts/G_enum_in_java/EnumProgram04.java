package com.nareshit.D_java_support_concepts.G_enum_in_java;

//Comparing the constant of an enum
public class EnumProgram04 
{
	enum Color { RED,BLUE } 

   public static void main(String args[])
   {
        Color c1 = Color.RED; 
        Color c2 = Color.RED;  
		  
        if(c1 == c2)
        {
              System.out.println("== Operator");
        }
        if(c1.equals(c2))
        {
               System.out.println("equals method");
        }
   }	
}

