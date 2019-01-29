package com.dprog;

public class Fibonacci {
	public int[] fib(int num) {
		if (num == 0) {
			System.err.println("Enter number greater than 0");
			return null;
		}
		int[] fibArr = new int[num + 1];
		fibArr[0] = 0;
		fibArr[1] = 1;
		for (int i = 2; i < num + 1; i++) {
			fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
		}
		return fibArr;
	}

	public static void main(String[] args) {
		int size = 13;

		if (size == 0) {
			System.err.println("Enter number greater than 0");
		} else {
			int[] result = new Fibonacci().fib(size);
			for (int i = 0; i < result.length - 1; i++) {
				System.out.print(result[i] + " \t");
			}
		}

	}
}
