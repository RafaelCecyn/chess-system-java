package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // posição da peça recém criada é nula
	}

	protected Board getBoard() {
		return board; // Somente acessível a classes do mesmo pacote e subclasses
	}

	
	
	
	
}
