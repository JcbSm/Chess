package model;

import piece.Piece;

public class Square {
	
	private Piece piece;
	private Coordinate coordinate;
	
	Square(Coordinate coordinate, Piece piece) {
		this.setCoordinate(coordinate);
		this.piece = piece;
	}
	
	Square(Coordinate coordinate) {
		this(coordinate, null);
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Piece getPiece() {
		return piece;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public boolean isEmpty() {
		return piece == null ? true : false;
	}
	
	public void removePiece() {
		this.setPiece(null);
	}
}
