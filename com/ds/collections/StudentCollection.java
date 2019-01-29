package com.ds.collections;

public class StudentCollection implements Comparable<StudentCollection>{

	public String name;
	public int age;
	
	public StudentCollection(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentCollection s) {
		if (this.age == s.age) {
			return 0;
		}
		else if(this.age > s.age) {
		return 1;
		}else {
			return -1;
		}
	}
}
