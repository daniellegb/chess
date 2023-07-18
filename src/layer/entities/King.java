package layer.entities;

import board.Board;
import layer.ChessPiece;
import layer.Color;

public class King  extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

}
