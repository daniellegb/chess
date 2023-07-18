package layer.entities;

import board.Board;
import layer.ChessPiece;
import layer.Color;

public class Rook extends ChessPiece  {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

}
