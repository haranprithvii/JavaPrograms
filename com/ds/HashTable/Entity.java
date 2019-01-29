package com.ds.HashTable;

public class Entity {
int key;
Object value;
Entity next;
	public Entity(int key, Object value, Entity next) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	public Entity(){
		next = null;
	}
	public int GetKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}
}
