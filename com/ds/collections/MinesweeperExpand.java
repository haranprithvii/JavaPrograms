package com.ds.collections;

import java.util.Arrays;

public class MinesweeperExpand {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] field1 = {{0, 0, 0, 0, 0},
                          {0, 1, 1, 1, 0},
                          {0, 1, -1, 1, 0}};
        
        //System.out.println(Arrays.deepToString(click(field1, 3, 5, 2, 2)));
        
        //should return:
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]

        // click(field1, 3, 5, 1, 4) should return:
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]


        int[][] field2 = {{-1, 1, 0, 0},
                          {1, 1, 0, 0},
                          {0, 0, 1, 1},
                          {0, 0, 1, -1}};
        //System.out.println(Arrays.deepToString(click(field2, 3, 5, 0, 1)));
        System.out.println(Arrays.deepToString(click(field2, 4, 4, 1, 3)));
        // click(field2, 4, 4, 0, 1) should return:
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]

        // click(field2, 4, 4, 1, 3) should return:
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
    }

    // Implement your solution below.
    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
        if (field[givenI][givenJ] == 0) {
        	for (int i=0; i<=numRows-1; i++) {
        		for (int j=0; j<=numCols-1; j++) {
        			if (field[i][j] == 0) {
        				field[i][j] -= 2;
        			}
        		}
        	}
        }
    	return field;
    }
 }
