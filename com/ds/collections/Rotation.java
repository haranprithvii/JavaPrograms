package com.ds.collections;

public class Rotation {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        //System.out.println(isRotation(array1, array2a)); //should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        //System.out.println(isRotation(array1, array2b));
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        System.out.println(isRotation(array1, array2c));
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
    	boolean isRotationFlag = false;
    	if (array1.length != array2.length) {
    		return isRotationFlag;
    	}
    	int key = array1[0];
    	int keyIndex = -1;
    	for (int i = 0; i <array2.length; i++) {
    		if (key == array2[i]) {
    			keyIndex = i;
    			break;
    		}
    	}
    	if (keyIndex == -1) {
    		return isRotationFlag;
    	}
    	for (int i=0; i<array1.length; i++) {
    		int index = (keyIndex+i)%array1.length;
    		if (array1[i] != array2[index]) {
    			isRotationFlag = false;
    			return isRotationFlag;
    		}
    		isRotationFlag = true;
    	}
    	return isRotationFlag;
    }
}
