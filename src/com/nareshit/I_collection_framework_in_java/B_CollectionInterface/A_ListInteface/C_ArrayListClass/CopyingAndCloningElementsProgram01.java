package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;

public class CopyingAndCloningElementsProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BCS");

        @SuppressWarnings("unchecked")
		ArrayList<String> cloneList = (ArrayList<String>) original.clone();
        System.out.println("Cloned List: " + cloneList);

       
        ArrayList<String> copiedList = new ArrayList<>(original);
        System.out.println("Copied List: " + copiedList);
        


	}

}
