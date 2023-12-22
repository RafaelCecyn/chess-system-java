package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // posição da peça recém criada é nula
	}

	protected Board getBoard() {
		return board; // Somente acessível a classes do mesmo pacote e subclasses
	}

	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMoves(Position position) { // template method
		return possibleMoves()[position.getRow()][position.getColumn()]; // método concreto usando o método abstrato
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves(); // método concreto depende de método abstrato
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
