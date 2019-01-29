package com.ds.collections;

public class EmployeeCollection implements Comparable<Integer>{
	String name;
	int age;
	
	public EmployeeCollection(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Integer ageCompare) {
		// TODO Auto-generated method stub
		return this.age - ageCompare;
	}
	public EmployeeCollection() {
		// TODO Auto-generated constructor stub
	}

}
