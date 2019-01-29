package com.ds.linkedlist;

public class DoublyLinkedList<T> {
	DoubleNode head;
	public DoublyLinkedList() {
		head = null;
	}
	public void add(Object value) {
		DoubleNode newNode = new DoubleNode(value, null, null);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void display() {
		DoubleNode n = head;
		while(n != null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
	
	public void delete() {
		head = head.next;
		head.prev = null;
	}

}
