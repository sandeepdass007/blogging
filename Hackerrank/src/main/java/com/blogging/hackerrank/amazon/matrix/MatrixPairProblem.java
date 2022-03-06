package com.blogging.hackerrank.amazon.matrix;

public class MatrixPairProblem {
	
	private int maxPair = 0;
	private int siblingCounter = 0;
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] {
			{1,1,0,0},
			{0,0,1,0},
			{0,0,0,0},
			{1,0,1,1},
			{1,1,1,1},
		};
		final int maximumPairs = new MatrixPairProblem().getMaxPair(matrix);
		System.out.println(maximumPairs);
	}
	
	private int getMaxPair(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for(int rowOffset = 0; rowOffset < rows; rowOffset++) {
			for(int colOffset = 0; colOffset < cols; colOffset++) {
				processGrouping(matrix, rowOffset, colOffset, rows, cols);
				if(siblingCounter != 0) {
					maxPair++;
					siblingCounter = 0;
				}
			}
		}
		return maxPair;
	}
	
	private void processGrouping(int[][] matrix, int x, int y, int rows, int cols) {
		if(x >= rows || y >= cols || x < 0 || y < 0) {
			return;
		}
		int nodeVal = matrix[x][y];
		if(nodeVal == 0) {
			return;
		}
		matrix[x][y] = 0; // reset the original value indicating node is processed
		siblingCounter++;
		// process right adjacent node
		processGrouping(matrix, x, y + 1, rows, cols);
		// process bottom adjacent node
		processGrouping(matrix, x + 1, y, rows, cols);
		// process top adjacent node
		processGrouping(matrix, x - 1, y, rows, cols);
	}
}
