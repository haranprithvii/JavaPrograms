package com.dprog;

import java.util.*;

public class WordArray {
	public static void main(String[] args) {
		String word = "COOL";
		char[] wordChar = word.toLowerCase().toCharArray();
		countFreq(wordChar);
		char[] array = {'a','b','c','o','l','m','o','l','f'};
		countFreq(array);
		
	}
	
	public static void countFreq(char[] wordChar) {
		int frequency = 1;
		Map<Character, Integer> mapOfWords = new HashMap<Character, Integer>();
		for (Character s : wordChar) {
			if(mapOfWords.get(s) != null) {
				mapOfWords.put(s, frequency+1);
			}else {
				mapOfWords.put(s, frequency);
			}
		}
		for (Character key : mapOfWords.keySet()) {
			//if (map.get(key) >= maxFreq - 1)
			System.out.print(key+" :"+mapOfWords.get(key)+" \t");
		}
		
	}
	}
