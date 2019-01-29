package com.ds.practice;

import java.util.*;

public class UniqueNumbersAmazon {

	public static void main(String[] args) {
		int[] array = {1,2,2,3,4,4,5,6,6,6,5,7,8,8,9};
		ArrayList<Integer> uniqueNumbers = new UniqueNumbersAmazon().getUniqueNumbers(array);
		for (Integer number : uniqueNumbers) {
			System.out.println(number);
		}
	}
	ArrayList<Integer> getUniqueNumbers(int[] array){
		ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<array.length; i++) {
			if(map.get(array[i]) != null) {
				int freq = map.get(array[i]);
				map.put(array[i], freq+1);
			}else {
				map.put(array[i], 1);
			}
		}
		for (int numbers : map.keySet()) {
			if(map.get(numbers) == 1)
				resultNumbers.add(numbers);
		}
		return resultNumbers;
	
	}
}
