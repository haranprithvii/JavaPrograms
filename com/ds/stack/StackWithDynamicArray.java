package com.ds.stack;

import java.util.Arrays;

public class StackWithDynamicArray<T> {

	Object[] ArrayOfStack;
	int size;
	int top;
	public StackWithDynamicArray(int size) {
		this.size = size;
		ArrayOfStack = new Object[size];
		top = -1; // Initial
	}

	public void push(Object newItem) {
		ensureCapacity(top+2);
		
		top = top+1;
		ArrayOfStack[top] = newItem;
	}
	
	public int getSize() {
		return ArrayOfStack.length;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = ArrayOfStack.length;
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity*2;
			if(newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			ArrayOfStack = Arrays.copyOf(ArrayOfStack, newCapacity);
		}
	}
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T item = (T)ArrayOfStack[top];
		top = top-1;
		return item;
	}
	
	public boolean isFull() {
		return (top == size-1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
}
