package com.ds.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<Integer>();
	set.add(10);
	set.add(13);
	set.add(16);
	set.add(16);
	set.add(10);
	
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext()) {
		System.err.println(itr.next());
	}
}
}
