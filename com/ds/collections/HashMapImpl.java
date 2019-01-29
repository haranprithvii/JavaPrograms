package com.ds.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(01, "Rajan");
	map.put(02, "Jainam");
	map.put(03, "Ravi");
	map.put(04, "Leena");
	for (Map.Entry m: map.entrySet()) {
		System.out.println("Key: "+m.getKey());
		System.out.println("Value: "+m.getValue());
	}
	map.put(1, "Prithvi");
	System.out.println(map.get(1));
	map.remove(2);
	}

}
