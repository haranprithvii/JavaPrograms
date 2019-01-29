package com.ds.collections;

public class MineSweeper {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        // mineSweeper(bombs1, 3, 3) should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        mineSweeper(bombs2, 3, 4);
        System.out.println(mineSweeper(bombs2, 3, 4));
        //should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int[] bomb: bombs) {
        	int row = bomb[0];
        	int col = bomb[1];
        	field[row][col] = -1;
        	for (int i=row-1; i<row+2; i++) {
        		for (int j=col-1; j<col+2; j++) {
        			if (0 <= i && i < numRows &&
                            0 <= j && j < numCols &&
                            field[i][j] != -1) {
                        field[i][j] += 1;
                    }
        		}
        	}
        }
        return field;
    }
 }
