package piece;

import player.PlayerType;

public abstract class Piece {
	
	private PieceType type;
	private PlayerType player;
	
	public Piece(PlayerType player, PieceType type) {
		this.type = type;
		this.player = player;
	}
	
	@Override
	public String toString() {
		return player == PlayerType.WHITE ? type.toString().toUpperCase() : type.toString();
	}
	
	/**
	 * Get the player
	 * @return {PlayerType} Player
	 */
	public PlayerType getPlayer() {
		return player;
	}
	
	public PieceType getType() {
		return type;
	}
}
