package com.ds.linkedlist;

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Prithvi");
		ls.add("Sachin");
		ls.add("Mayank");
		ls.add("Pooja");
		ls.display();
		ls.delete();
		System.out.println("After Delete: ");
		//ls.add("Pointer");
		ls.display();
		
	}

}
