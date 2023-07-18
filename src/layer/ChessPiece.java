package layer;

import board.Board;
import board.Piece;
import board.Position;

public class ChessPiece extends Piece {


	private Color color;
	private int moveCount;
	
	//All methods bellow needs to be implemented!
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return null;
	}
	
	public boolean isThereOpponentPiece(Position position) {
		return false;
	}
	
	public void increaseMoveCount() {
		moveCount += moveCount;
	}
	
	public void decreaseMoveCount() {
		moveCount -= moveCount;
	}
	

}
