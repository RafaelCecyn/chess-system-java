package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}


	public int getRow() {
		return row;
	}

	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a'); // transforma a posição do xadrez em matriz a8 to 00
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow()); // transforma a posição da matriz para o xadrez 00 to a8
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	

}
