package com.ds.queue;

import com.ds.linkedlist.DoubleNode;

public class QueueLinkedList<T> {
	DoubleNode front;
	DoubleNode rear;
	public QueueLinkedList() {
		rear = null;
		front = null;
	}
	public void queue(Object value) {
		DoubleNode newNode = new DoubleNode(value, null, null);
		if(rear == null || front == null) {
			rear = newNode;
			front = newNode;
		}else {
			newNode.next = null;
			newNode.prev = rear;
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public T dequeue() {
		if (rear == null || front == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		T value = (T) front.value;
		front = front.next;
		if (front != null)
		front.prev = null;
		return value;
	}
}
