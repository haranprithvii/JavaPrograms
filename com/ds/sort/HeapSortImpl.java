package com.ds.sort;

public class HeapSortImpl {
	static int total;

	static void heapify(Comparable[] arr, int i) {
		int left = i * 2;
		int right = i * 2 + 1;
		int great = i;
		if (left <= total && arr[left].compareTo(arr[great]) >= 0)
			great = left;
		if (right <= total && arr[right].compareTo(arr[great]) >= 0)
			great = right;
		if (great != i) {
			swap(arr, i, great);
			heapify(arr, great);
		}
	}

	static void swap(Comparable[] arr, int a, int b) {
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void heapSort(Comparable[] arr) {
		total = arr.length - 1;
		for (int i = total / 2; i >= 0; i--)
			heapify(arr, i);
		for (int i = total; i > 0; i--) {
			swap(arr, 0, i);
			total--;
			heapify(arr, 0);
		}
	}

	public static void main(String[] args) {
		Integer[] array = { 12, 23, 4, 3, 5, 1, 67 };
		System.out.println("Before Sorting");
		print(array);
		heapSort(array);
		System.out.println("\nAfter Sorting");
		print(array);
	}

	public static void print(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
