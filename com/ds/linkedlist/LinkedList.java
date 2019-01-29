package com.ds.linkedlist;

public class LinkedList<T> {
Node head;
	public LinkedList() {
		head = null;
	}
	public void add(Object value) {
		Node newNode = new Node(value, null);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void display() {
		Node n = head;
		while(n != null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
	
	public void delete() {
		head.next = head;
	}
}
