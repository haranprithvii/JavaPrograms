package com.ds.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Sameer");
		list.add("Rahul");
		list.add("Prem");
		list.add("Rohan");
		list.add("Ranjeet");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.err.println("Name: "+iter.next());
		}
		
	}
}
