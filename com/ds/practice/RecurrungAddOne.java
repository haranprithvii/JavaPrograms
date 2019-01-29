package com.ds.practice;

import java.util.*;

public class RecurrungAddOne {

	public static int[] addOne(int[] array) {
		int[] resultArray = new int[array.length];
		int carryOn = 1;
		for (int i = array.length - 1; i >= 0; i--) {
			int total = array[i] + carryOn;
			if (total == 10) {
				carryOn = 1;
			} else {
				carryOn = 0;
			}
			resultArray[i] = total % 10;
		}
		if (carryOn == 1) {
			resultArray = new int[array.length + 1];
			resultArray[0] = 1;
		}
		return resultArray;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the content of an array: ");
		for (int i = 0; i <= size - 1; i++) {
			array[i] = in.nextInt();
		}
		for (int i : array) {
			System.out.print(i);
		}

		// int[] array = {1,2,9,9};
		
		int[] result = addOne(array);
		System.out.println("the result after addition is: ");
		for (int i : result) {
			System.out.print(i);
		}
		in.close();
	}

}
