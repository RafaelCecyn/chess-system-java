package chess;

import boardgame.BoardException;

public class ChessException extends BoardException { // Captura tanto ChessException como BoardException
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);  // Construtor repassa a mensagem para o construtor do RuntimeException
	}

}
