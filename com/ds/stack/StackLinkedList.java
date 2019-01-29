package com.ds.stack;

import com.ds.linkedlist.Node;

public class StackLinkedList<T> {

	Node top;
	public StackLinkedList() {
		top = null;
	}
	public void push(Object value) {
		Node newNode = new Node(value, null);
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public void display() {
		Node n = top;
		while(n != null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
	
	public T pop() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return null;
		}
		T value = (T)top.value;
		top.next = top;
		return value;
	}
}
