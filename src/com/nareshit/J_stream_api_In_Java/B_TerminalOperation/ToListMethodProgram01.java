package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Student(Integer rollNumber,String name)
{
	
}

public class ToListMethodProgram01 {

	public static void main(String[] args) 
	{
		//Creating the Student object
		Student s1= new Student(101, "Gokul");
		Student s2= new Student(102, "Ganesh");
		Student s3= new Student(103, "Rahul");
		Student s4= new Student(104, "Rushi");
		Student s5= new Student(105, "Ram");
		
		//Storing the Student object into Stream
		Stream<Student> studentStream = Stream.of(s1,s2,s3,s4,s5);
		
		//Performing the Stream operation[name char greter or equal than five]
		Stream<Student> filteredName = studentStream.filter(student->student.name().length()>=5);
		
		//converting into List
		List<Student> studentName = filteredName.collect(Collectors.toList());
		
		//Printing the Student name
		studentName.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------------");
		//All program in one line
		Stream.of(s1,s2,s3,s4,s5).filter(student->student.name().length()>=5).collect(Collectors.toList()).forEach(System.out::println);

	}

}
