package piece;

public enum PieceType {
	PAWN("p"),
	ROOK("r"),
	KNIGHT("n"),
	BISHOP("b"),
	QUEEN("q"),
	KING("k");
	
	private String value;
	
	PieceType(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
