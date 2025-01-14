package com.nareshit.D_java_support_concepts.K_method_reference;

@FunctionalInterface
interface Trainer 
{
  void getTraining(String name, int experience);
}

class InstanceMethod 
{
   public void getTraining(String name, int experience)  
   {
	   System.out.println("Trainer name is :"+name+" having "+experience+" years of experience.");
   }
}

public class InstanceMethodReferenceProgram 
{
    public static void main(String[] args) 
    {
    	//Using Lambda Expression
    	Trainer t1 = (name,  exp)-> System.out.println("Trainer name is :"+name+" and total experience is :"+exp+ " years");
    	t1.getTraining("Smith", 5);
    	
    	
    	//By using Method reference 
    	Trainer t2 = new InstanceMethod()::getTraining;
    	t2.getTraining("Scott", 10);
    	
    	
    	
    	
    }
}
