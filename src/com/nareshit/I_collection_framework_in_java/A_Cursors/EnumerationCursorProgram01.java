package com.nareshit.I_collection_framework_in_java.A_Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorProgram01 {

	public static void main(String[] args) 
	{
		Vector<Integer> al=new Vector<Integer>();
		al.add(120);
		al.add(130);
		al.add(140);
		al.add(150);
		al.add(160);
		al.add(170);
		
		Enumeration<Integer> el=al.elements();
		
		while(el.hasMoreElements())
		{
			System.out.print(el.nextElement()+",");
		}

	}

}
