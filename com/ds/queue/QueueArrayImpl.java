package com.ds.queue;

public class QueueArrayImpl {

	public static void main(String[] args) {
		QueueArray<String> qa = new QueueArray<String>(2);
		qa.dequeue();
		qa.queue("Akash");
		qa.queue("Chaitu");
		System.out.println(qa.dequeue());
		System.out.println(qa.dequeue());
		qa.queue("Sameer");
		qa.queue("Sachin");
		//while(qa.getSize() > 0) {
			
		//}
		

	}

}
