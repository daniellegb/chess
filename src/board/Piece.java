package board;

public class Piece {

	protected Position position;
	private Board board;
	
	
	
	public Piece(Board board) {
		position = null;
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public boolean[][] possibleMoves(){
		return null;
	}
	
	public boolean possibleMove() {
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}

}
