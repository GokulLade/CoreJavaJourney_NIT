package com.nareshit.D_java_support_concepts.K_method_reference;

@FunctionalInterface  
interface A 
{
    Test createObject();  
}

class Test 
{
    public Test() 
    {
        System.out.println("Test class Constructor invoked");
    }
}
public class ConstructorReferenceProgram01
{
    public static void main(String[] args) 
    {
        //Lambda 
    	A a1 = ()-> new Test();
    	a1.createObject();
    	
    	//Constructor Reference 
    	A a2 = Test::new;
    	a2.createObject();
    }
}
