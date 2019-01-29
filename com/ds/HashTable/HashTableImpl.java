package com.ds.HashTable;

public class HashTableImpl {

	public static void main(String[] args) {
		HashTableArray<String> ht = new HashTableArray<String>(5);
		ht.put(01, "Prithvi");
		ht.put(02, "Sachin");
		System.out.println(ht.get(1));

	}

}
