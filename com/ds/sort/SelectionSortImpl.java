package com.ds.sort;

public class SelectionSortImpl {

	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[index])
					index = j;
			}
			if (index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] array = { 12, 23, 4, 3, 5, 1, 67 };
		System.out.println("Before Sorting");
		print(array);
		selectionSort(array);
		System.out.println("\nAfter Sorting");
		print(array);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
