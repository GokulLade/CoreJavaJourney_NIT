package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

record Product(Integer productid, String productname) implements Serializable {

}

public class SerializationAndDeSerializationProgram01 {

	public static void main(String[] args) throws IOException 
	{
		ArrayList<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(111, "Laptop"));
		listOfProduct.add(new Product(222, "Camera"));
		listOfProduct.add(new Product(333, "Mobile"));
		listOfProduct.add(new Product(444, "Watch"));

		//Creating file
		File f=new File("Product.txt");
		if(!(f.exists())) f.createNewFile();
		
		// Serialization
		var fos = new FileOutputStream("Product.txt");
		var oos = new ObjectOutputStream(fos);

		try (fos; oos) 
		{
			oos.writeObject(listOfProduct);
			System.out.println("Product Data stored in the file");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		// De-serialization
		var fin = new FileInputStream("Product.txt");
		var ois = new ObjectInputStream(fin);

		try (fin; ois) 
		{
			@SuppressWarnings("unchecked")
			ArrayList<Product> list = (ArrayList<Product>) ois.readObject();
			System.out.println(list);
		} 
		catch (Exception e)
		{

		}

	}

}
