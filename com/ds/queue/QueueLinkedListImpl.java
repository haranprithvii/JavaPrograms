package com.ds.queue;

public class QueueLinkedListImpl {

	public static void main(String[] args) {
		QueueLinkedList<Integer> qll = new QueueLinkedList<Integer>();
		qll.queue(10);
		qll.queue(12);
		qll.queue(14);
		
		System.out.println(qll.dequeue());
		System.out.println(qll.dequeue());
		System.out.println(qll.dequeue());
		System.out.println(qll.dequeue());
	}

}
