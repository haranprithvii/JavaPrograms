package com.ds.array;

public class DynamicArrayImplementation {
	
	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		da.put(13);
		System.out.println("Size is: "+da.getSize());
		da.put(23);
		System.out.println("Size is: "+da.getSize());
		da.put(54);
		System.out.println("Size is: "+da.getSize());
		da.put(24);
		da.put(43);
		System.out.println("Size is: "+da.getSize());
		
		for (int i=0;i<da.getSize();i++) {
			System.out.println(da.get(i));
		}
	}
}
