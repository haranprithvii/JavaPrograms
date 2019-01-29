package com.ds.collections;

import java.util.HashMap;
import java.util.Map;

public class MF {
	public static void main(String[] args) {
		// NOTE: The following input values are used for testing your solution.

		// mostFrequent(array1) should return 1.
		int[] array1 = { 1, 3, 1, 3, 2, 1 };
		System.out.println(mostFreqent(array1));
		// mostFrequent(array2) should return 3.
		int[] array2 = { 3, 3, 1, 3, 2, 1 };
		// mostFrequent(array3) should return null.
		int[] array3 = {};
		// mostFrequent(array4) should return 0.
		int[] array4 = { 0 };
		// mostFrequent(array5) should return -1.
		int[] array5 = { 0, -1, 10, 10, -1, 10, -1, -1, -1, 1 };
	}

	// Implement your solution below.
	public static Integer mostFreqent(int[] givenArray) {
		if (givenArray.length == 0) {
			return null;
		}
		Map<Integer, Integer> mapCount = new HashMap<Integer, Integer>();

		for (int i = 0; i < givenArray.length; i++) {
			if (mapCount.get(givenArray[i]) != null) {
				int freq = mapCount.get(givenArray[i]);
				mapCount.put(givenArray[i], freq + 1);
			} else {
				mapCount.put(givenArray[i], 1);
			}
		}
		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : mapCount.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		return maxEntry.getKey();
	}
}
