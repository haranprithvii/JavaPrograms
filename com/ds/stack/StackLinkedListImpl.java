package com.ds.stack;

public class StackLinkedListImpl {

	public static void main(String[] args) {
		StackLinkedList<String> st = new StackLinkedList<String>();
		st.pop();
		st.push("Akash");
		st.push("Chaitu");
		
		System.out.println(st.pop()); 
		System.out.println(st.pop());

	}

}
