package player;

public enum PlayerType {
	
	WHITE("w"), BLACK("b");
	
	private String value;
	
	PlayerType(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
