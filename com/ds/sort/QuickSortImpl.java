package com.ds.sort;

public class QuickSortImpl {
	static void quickSort(int[] arr, int low, int high) {
		if (low > high)
			return;
		int mid = low+(high-low)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		while (i <= j) {
			while(arr[i] < pivot) 
				i++;
			while(arr[j] > pivot)
				j--;
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(arr, low, j);
		if(high > i)
			quickSort(arr, i, high);
		

	}

	public static void main(String[] args) {
		int[] array = { 12, 23, 4, 3, 5, 1, 67 };
		System.out.println("Before Sorting");
		print(array);
		quickSort(array, 0, array.length-1);
		System.out.println("\nAfter Sorting");
		print(array);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
