package com.ds.practice;

import java.util.*;

public class RecurrungCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to check: ");
		String s = in.next();
		System.out.println(firstRecurring(s));
		in.close();
	}

	static public String firstRecurring(String st) {
		// char[] sArray = st.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : st.toCharArray()) 
		{
			if (map.get(c) != null) {
				return c.toString();
			}else {
				map.put(c, 1);
			}
		}
		return null;
		}

}
