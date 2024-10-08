package com.nt.test;

import java.util.Arrays;
import java.util.List;

record Student(String studentName,String studentCourse)
{
	
}


public class StreamExample3 
{
	public static void main(String[] args) 
	{
		List<Student> students = Arrays.asList(new Student("Alice", "Java"),new Student("Bob", "Python"),new Student("Charlie", "Java"),new Student("David", "C++"),new Student("Eve", "JavaScript"));
		
		students.stream().filter(list->list.studentCourse().equalsIgnoreCase("java")).map(list->list.studentName()).forEach(System.out::println);
		
	}
}


