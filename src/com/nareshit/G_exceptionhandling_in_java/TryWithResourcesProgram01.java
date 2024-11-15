package com.nareshit.G_exceptionhandling_in_java;

import java.io.Closeable;
import java.io.IOException;

class DatabaseResources implements Closeable{

	@Override
	public void close() throws IOException 
	{
		System.out.println("Database Resources Close");
	}
}

class FileResources implements AutoCloseable{

	@Override
	public void close() throws Exception 
	{
		System.out.println("File Resources Close");
		
	}
	
}

public class TryWithResourcesProgram01 {

	public static void main(String[] args) 
	{
		DatabaseResources dr=new DatabaseResources();
		FileResources fr=new FileResources();
		
		try(dr;fr) // Right to left
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Divide by Zero Problem");
		}
		

	}

}
