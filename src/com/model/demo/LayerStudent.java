package com.model.demo;

import java.util.*;
public class LayerStudent {

	public static List<Student> getStudent(){
		
		List<Student> student = new ArrayList<>();
		
		return student;
	} 
	
	public static void setStudent(String firstName, String lastName, String email) {
		
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(firstName, lastName, email));
	}
}
