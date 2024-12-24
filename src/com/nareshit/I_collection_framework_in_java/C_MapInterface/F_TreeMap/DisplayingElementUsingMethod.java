package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class DisplayingElementUsingMethod {

	 public static void main(String args[]) 
     {
           TreeMap<Object,Object> map = new TreeMap<>();
           map.put("one","1");
           map.put("two",null);
           map.put("three","3");
			map.put("four",4);

           displayMap(map);  

           map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
	 	       
     }
     static void displayMap(TreeMap map) 
     {
          Collection<Object> c = map.entrySet();   //Set<Map.Entry>

          Iterator<Object> i = c.iterator();
          i.forEachRemaining(x -> System.out.println(x));
     }


}
