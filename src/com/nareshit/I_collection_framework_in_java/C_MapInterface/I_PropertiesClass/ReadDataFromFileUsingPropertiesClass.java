package com.nareshit.I_collection_framework_in_java.C_MapInterface.I_PropertiesClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadDataFromFileUsingPropertiesClass {

	public static void main(String[] args) throws IOException 
	{
		FileReader reader = new FileReader("db.properties");

		Properties p1 = new Properties();
		p1.load(reader);

		String driverName = p1.getProperty("driverName");
		String userName = p1.getProperty("username");
		String password = p1.getProperty("password");

		System.out.println("Driver name is :" + driverName);
		System.out.println("User name is :" + userName);
		System.out.println("Password name is :" + password);

	}

}
