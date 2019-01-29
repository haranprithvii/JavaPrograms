package com.ds.array;

import java.util.*;


public class SDArray {

	public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter the Size of an Array: ");
		 int size = in.nextInt();
		 int[] arr = new int[size];
		 for (int i = 0; i< arr.length; i++) {
			 System.out.print("Enter Element "+i+": ");
			 arr[i] = in.nextInt();
		}
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	in.close();
	Student[] students = new Student[2];
	students[0] = new Student("Prithvi", 27);
	students[1] = new Student("Sameer", 23);
	for (Student student : students) {
		System.out.println("Student name is: "+student.name+" and age is: "+student.age);
	}
	}
	
	
}
