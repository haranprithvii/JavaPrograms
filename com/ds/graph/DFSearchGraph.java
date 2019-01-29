package com.ds.graph;

import java.util.Stack;

public class DFSearchGraph {
	public int size;
	AdjencyList[] array;

	public DFSearchGraph(int size) {
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

	public void dfsExplore(int startVertex) {
		Boolean[] visited = new Boolean[size];
		for (int i = 0; i < size; i++)
			visited[i] = false;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(startVertex);
		while (!stack.isEmpty()) {
			int n = stack.pop();
			// stack.push(n);
			visited[n] = true;
			Node head = array[n].head;
			Boolean isDone = false;
			while (head != null) {
				if (visited[head.value] == false) {
					stack.push(head.value);
					visited[head.value] = true;
					isDone = false;
					break;
				} else {
					head = head.next;
				}
			}
			if (isDone == true) {
				int out = stack.pop();
				System.out.println("Visited node: " + out);
			}
		}

	}

}
