package com.ds.queue;

import java.util.Arrays;

public class QueueDynamicArray<T> {
	Object[] ArrayOfQueue;
	int front;
	int rear;
	int size;

		public QueueDynamicArray(int size) {
			this.size = size;
			ArrayOfQueue = new Object[this.size];
			front = -1;
			rear = -1;
			}
		public boolean isFull() {
			return (rear == size-1);
		}
		
		public boolean isEmpty() {
			return (front == -1 || front > rear);
		}
		
		public void ensureCapacity(int minCapacity) {
			int oldCapacity = getSize();
			if(minCapacity > oldCapacity) {
				int newCapacity = oldCapacity*2;
				if(newCapacity < minCapacity) {
					newCapacity = minCapacity;
				}
				ArrayOfQueue = Arrays.copyOf(ArrayOfQueue, newCapacity);
			}
		}
		
		public void queue(Object newItem) {
		/*
		 * if (isFull()) { System.out.println("Queue is Full"); return; }
		 */
			ensureCapacity(rear+2);
			rear = rear+1;
			ArrayOfQueue[rear] = newItem;
			if(front == -1) {
				front = 0;
			}
		}
		
		public T dequeue() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return null;
			}
			T objectOut = (T) ArrayOfQueue[front];
			front += 1;
			return objectOut;
		}
		
		public int getSize() {
			return ArrayOfQueue.length;
		}
		

}
