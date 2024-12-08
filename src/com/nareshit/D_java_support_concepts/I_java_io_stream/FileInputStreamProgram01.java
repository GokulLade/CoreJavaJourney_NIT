package com.nareshit.D_java_support_concepts.I_java_io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamProgram01 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream fis=new FileInputStream("C:\\\\Documents\\\\file.txt");
		
		try(fis) 
		{
			while(true)
			{
				int i=fis.read();
				if(i==-1) break;
				
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
