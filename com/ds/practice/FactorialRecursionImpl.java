package com.ds.practice;

import java.util.*;

public class FactorialRecursionImpl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		System.out.println("The factorial of "+num+" is: "+factorial(num));
		in.close();
	}

	private static int factorial(int num) {
		if (num == 0) return 1;
		else {
			return num * factorial(num - 1);
		}
	}
}
