package com.search;

public class DataSet {
public int[] data;
int numOfTry;
	public DataSet(int size) {
		data = new int[size];
		for (int i=1; i<=size; i++) {
			data[i-1] = i;
			numOfTry = 0;
		}
	}
	
	public int getSize() {
		return data.length;
	}

}
