package com.nareshit.D_java_support_concepts.I_java_io_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram01 {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos=new FileOutputStream("C:\\Documents\\file.txt");
		
		try(fos)
		{
			String str="Hyderabad is an IT Hub";
			byte bytes[]=str.getBytes();
			fos.write(bytes);
			
		}
	
		System.out.println("Data Stored Succeefully..!");
	}

}
