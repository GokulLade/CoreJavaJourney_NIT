package com.nareshit.D_java_support_concepts.M_optionalclass_in_java;

import java.util.Optional;

public class OptionalClassProgram04 {

	public static void main(String[] args) 
    {  	
        Optional<String> optl = Optional.of("India");
        System.out.println(optl.hashCode()); 

        Optional<String> newOptnl = modifyOptional(optl);
        System.out.println(newOptnl.hashCode());

        // Check if the original Optional is still the same
        System.out.println("Address is :" + (optl == newOptnl));       
      
    }

    public static Optional<String> modifyOptional(Optional<String> optional) 
    {
        if (optional.isPresent())
        {
            return Optional.of("Modified: " + optional.get());
        } 
        else 
        {
            return Optional.empty();
        }
    }
}
