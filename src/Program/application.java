package Program;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
}
}
