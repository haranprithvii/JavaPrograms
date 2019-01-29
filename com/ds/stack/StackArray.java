package com.ds.stack;

public class StackArray<T> {
	Object[] ArrayOfStack;
	int size;
	int top;
	public StackArray(int size) {
		this.size = size;
		ArrayOfStack = new Object[size];
		top = -1; // Initial
	}

	public void push(Object newItem) {
		if (isFull()) {
			System.out.println("Stack is full");
			return ;
		}
		top = top+1;
		ArrayOfStack[top] = newItem;
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
