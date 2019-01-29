package com.ds.queue;

public class QueueDynamicArrayImpl {

	public static void main(String[] args) {
		QueueDynamicArray<Integer> dq = new QueueDynamicArray<Integer>(2);
		dq.queue(10);
		dq.queue(12);
		System.out.println(dq.getSize());
		dq.queue(14);
		System.out.println(dq.getSize());

	}

}
