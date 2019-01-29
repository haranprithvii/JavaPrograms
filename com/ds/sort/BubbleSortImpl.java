package com.ds.sort;

public class BubbleSortImpl {
	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 12, 23, 4, 3, 5, 1, 67 };
		System.out.println("Before Sorting");
		print(array);
		bubbleSort(array);
		System.out.println("\nAfter Sorting");
		print(array);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
