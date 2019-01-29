package com.ds.linkedlist;

public class DLinkedListImpl {

	public static void main(String[] args) {
		DoublyLinkedList<String> ls = new DoublyLinkedList<String>();
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
