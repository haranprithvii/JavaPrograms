package com.ds.collections;

import java.util.*;

public class AutoFillWords {

	public static List<String> wordsCollection(String[] cities, String s) {
		List<String> autoFilledCities = new ArrayList<String>();
		
		int length = s.length();
		for (String city: cities) {
			if (city.toLowerCase().substring(0,length).contains(s.toLowerCase())) {
			autoFilledCities.add(city);	
			}
		}
		return autoFilledCities;
	}
	public static void main(String[] args) {
		
		String cities[] = {"Alabama", "Boston", "Cambridge", "California", "Alaska"};
		String s = "cal";
		for (int i=0; i<s.length(); i++) {
			List<String> foundCities = wordsCollection(cities, s.substring(0, i));
			System.out.println(foundCities);
		}
		
	}

}
