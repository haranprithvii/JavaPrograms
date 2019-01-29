package com.ds.HashTable;

public class HashTableArray<T> {
Entity[] hashArray;
int size;
	public HashTableArray(int size) {
		this.size = size;
		hashArray = new Entity[size];
		for(int i=0; i<size; i++) {
			hashArray[i] = new Entity();
		}
	}
	int GetHash(int key) {
		return key%size;
	}
	public void put(int key, Object value) {
		int hashIndex = GetHash(key);
		Entity hashValue = hashArray[hashIndex];
		Entity newItem = new Entity(key, value, null);
		newItem.next = hashValue.next;
		hashValue.next = newItem;
	}
	public T get(int key) {
		T value = null;
		int hashIndex = GetHash(key);
		Entity hashValue = hashArray[hashIndex];
		while(hashValue != null) {
			if(hashValue.GetKey() == key) {
				value = (T)hashValue.getValue();
						break;
			}
			hashValue = hashValue.next;
		}
		return value;
	}
}
