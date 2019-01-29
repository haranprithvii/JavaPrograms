package com.ds.graph;

public class DFSearchImpl {

	public static void main(String[] args) {
		DFSearchGraph d = new DFSearchGraph(6);
		d.add(0, 2);
		d.add(0, 1);
		d.add(1, 4);
		d.add(1, 3);
		d.add(1, 0);
		d.add(3, 1);
		d.add(4, 1);
		d.add(2, 5);
		d.add(2, 0);
		d.add(5, 2);
		
		d.dfsExplore(0);

	}

}
