package com.ds.graph;

import java.util.*;

import com.ds.linkedlist.LinkedList;

public class BFSearchGraph {

	public int size;
	AdjencyList[] array;

	public BFSearchGraph(int size) {
		this.size = size;
		array = new AdjencyList[this.size];
		for (int i = 0; i < size; i++) {
			array[i] = new AdjencyList();
			array[i].head = null;
		}
	}

	public void add(int src, int dest) {
		Node n = new Node(dest, null);
		n.next = array[src].head;
		array[src].head = n;
	}

	public void bfsExplore(int startVertex) {
		Boolean[] visited = new Boolean[size];
		for (int i = 0; i < size; i++)
			visited[i] = false;
		Queue<Integer> q = new java.util.LinkedList<Integer>();
		q.add(startVertex);
		while (!q.isEmpty()) {
			int n = q.poll();
			System.out.println("Visited node: " + n);
			visited[n] = true;
			Node head = array[n].head;
			while (head != null) {
				if (visited[head.value] == false) {
					q.add(head.value);
					visited[head.value] = true;
				} else {
					head = head.next;
				}
			}

		}

	}

}
