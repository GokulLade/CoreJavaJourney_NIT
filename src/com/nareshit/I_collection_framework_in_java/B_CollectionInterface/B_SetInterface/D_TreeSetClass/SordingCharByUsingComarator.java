package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.D_TreeSetClass;

import java.util.Set;
import java.util.TreeSet;

public class SordingCharByUsingComarator {

	public static void main(String[] args) 
	{
		Set<Character> ch=new TreeSet<>((c1,c2)->c2.compareTo(c1));
		ch.add('G');
		ch.add('O');
		ch.add('K');
		ch.add('U');
		ch.add('L');
		
		ch.forEach(System.out::println);

	}

}
