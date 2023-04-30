package controller;

import model.Model;
import player.Player;
import view.View;

public class Controller {
	
	Model model;
	View view;
	
	public void initialize(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void reset() {
		loadFEN("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
	}
	
	public void setActivePlayer(Player player) {
		model.setActivePlayer(player);
	}
	
	public void loadFEN(String str) {
		// Remove all piece from the board.
		model.captureAll();
		
		// Parse FEN
		String[] fen = str.split(" ");
		
		String board = fen[0];
		String activeColor = fen[1];
		String castling = fen[2];
		String enpassant = fen[3];
		String halfmoves = fen[4];
		String fullmoves = fen[5];
		
		// Place pieces
		String[] rows = board.split("/");
		
		for (int rank = 7; rank >= 0; rank--) {
			String row = rows[rank];
			
			
		}
	}
}
