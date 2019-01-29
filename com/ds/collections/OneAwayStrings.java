package com.ds.collections;

public class OneAwayStrings {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your solution.
		//isOneAway("abcde", "abcd"); // should return true
		//isOneAway("abde", "abcde"); // should return true
		//isOneAway("a", "a"); // should return true
		//isOneAway("abcdef", "abqdef"); // should return true
		//isOneAway("abcdef", "abccef"); // should return true
		//isOneAway("abcdef", "abcde"); // should return true
		//isOneAway("aaa", "abc"); // should return false
		System.out.println(isOneAway("abcde", "abc")); // should return false
		//isOneAway("abc", "abcde"); // should return false
		//isOneAway("abc", "bcc"); // should return false
	}

	// Implement your solution below.
	public static Boolean isOneAway(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		if (Math.abs(c2.length-c1.length) > 2) {
			return false;
		}
		if (c2.length == c1.length) {
			return isOneAwaywithSameLength(c1, c2);
		}
		else if(c2.length > c1.length) {
			return isOneAwaywithDifLength(c2, c1);
		}else {
			return isOneAwaywithDifLength(c1, c2);
		}
	}

	public static Boolean isOneAwaywithSameLength(char[] c1, char[] c2) {
		int dif = 0;
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				dif += 1;
			}
			if (dif > 1) {
				return false;
			}
		}
		return true;

	}
	
	public static Boolean isOneAwaywithDifLength(char[] c1, char[] c2) {
		int dif = 0;
		int index = 0;
		
		while (index < c2.length) {
			if (c1[index+dif] == c2[index]) {
				index += 1;
			}else {
				dif += 1;
				if (dif > 1) {
					return false;
				}
			}
		}
		return true;
	}
}
