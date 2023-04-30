package model;

import controller.Controller;
import player.Player;
import view.View;

public class Model {
	
	enum States {
		PLAYING,
		WIN_WHITE,
		WIN_BLACK,
		DRAW
	}
	
	private View view;
	private Controller controller;
	
	private Square[][] squares = new Square[8][8];
	private Player activePlayer;
	private boolean[] castling = new boolean[4];
	private Coordinate enpassant;
	private int halfmoves;
	private int fullmoves;
	
	public void initialize(View view, Controller controller) {
		
		this.view = view;
		this.controller = controller;
		
		setSquares();
	}
	
	public void setSquares() {
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				squares[i][j] = new Square(new Coordinate(j, i));
			}
		}
	}
	
	public void captureAll() {
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				squares[i][j].removePiece();
			}
		}
	}

	public Player getActivePlayer() {
		return activePlayer;
	}

	public void setActivePlayer(Player activePlayer) {
		this.activePlayer = activePlayer;
	}

}
