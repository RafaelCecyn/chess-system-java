package chess;

public class ChessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);  // Construtor repassa a mensagem para o construtor do RuntimeException
	}

}
