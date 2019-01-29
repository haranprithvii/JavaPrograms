package com.search;

public class LinearSearchImpl {

	public static void main(String[] args) {
		DataSet data = new DataSet(100000);
		int search = 890;
		boolean isFound = false;
		for (int i=0; i<data.getSize(); i++) {
			data.numOfTry++;
			if(data.data[i] == search) {
				System.out.println("Element fount after "+data.numOfTry+" try");
				isFound = true;
				break;
			}
		}
	if (isFound == false) {
		System.out.println("Number not found");
	}
	}

}
