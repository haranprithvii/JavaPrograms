package com.ds.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueJavaImpl {

	public static void main(String[] args) {
		System.out.println("Basic Queue");
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(12);
		q.add(10);
		q.add(43);
		q.add(23);
		
		System.out.println(q.poll());
		
		System.out.println("Priority Queue");
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(10);
		pq.add(43);
		pq.add(23);
		System.out.println(q.poll());
		System.out.println(q.poll());
	
		PriorityQueue<StudentCollection> pqStudent = new PriorityQueue<StudentCollection>();
		pqStudent.add(new StudentCollection("Raman", 21));
		pqStudent.add(new StudentCollection("Raghav", 25));
		
		System.out.println("student queue");
		System.out.println(pqStudent.poll().name);
		

	}	
}
