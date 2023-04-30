package model;

public class Coordinate {
	
	final int file, rank;
	final String[] files = {"a", "b", "c", "d", "e", "f", "g", "h"};
	final String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8"};
	
	Coordinate(int x, int y) {		
		file = x;
		rank = y;
	}
	
	@Override
	public String toString() {
		return files[file] + ranks[rank];
	}
}
