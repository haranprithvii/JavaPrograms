package com.ds.collections;

import java.util.*;

public class ArrayListImpl {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		
		for (Integer number : list) {
			System.out.println(number);
		}
		
		List<EmployeeCollection> listOfEmployees = new ArrayList<EmployeeCollection>();
		listOfEmployees.add(new EmployeeCollection("Raman", 21));
		listOfEmployees.add(new EmployeeCollection("Raghav", 22));
		listOfEmployees.add(new EmployeeCollection("Vicky", 23));
		
		for (EmployeeCollection employee : listOfEmployees) {
			System.out.println("Name: "+employee.name+" age: "+employee.age);
		}
	}

}
