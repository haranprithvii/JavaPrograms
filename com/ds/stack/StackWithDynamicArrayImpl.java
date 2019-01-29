package com.ds.stack;

public class StackWithDynamicArrayImpl {
	
	public static void main(String[] args) {
		StackWithDynamicArray<Integer> sd = new StackWithDynamicArray<Integer>(2);
		sd.push(12);
		sd.push(14);
		System.out.println("Array Size: "+sd.getSize());
		sd.push(45);
		System.out.println("Array Size: "+sd.getSize());
	}
}
