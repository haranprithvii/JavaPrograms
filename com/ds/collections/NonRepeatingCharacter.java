package com.ds.collections;

import java.util.*;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your solution.
		//System.out.println(nonRepeating("abcab"));
		// should return 'c'
		//System.out.println(nonRepeating("abab")); // should return null
		//System.out.println(nonRepeating("aabbbc")); // should return 'c'
		System.out.println(nonRepeating("aabbdbc")); // should return 'd'
	}

	// Implement your solution below.
	public static Character nonRepeating(String s) {
		char[] c = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				Integer count = map.get(c[i]);
				map.put(c[i], count + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		
		for (Character ch: s.toCharArray()) {
			if (map.get(ch) == 1) {
				return ch;
			}
		}
		return null;
	}
}
