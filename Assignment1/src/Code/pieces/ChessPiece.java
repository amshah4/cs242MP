package Code.pieces;

import Code.ChessBoard;
import Code.ChessGame;
import Code.Square;
import Code.ChessGame.Team;

public abstract class ChessPiece
{
	protected ChessBoard board;
	protected String name;
	protected Team team;
	
	/* Using the piece's unique movement pattern, traces and ensures the 
	 * moved between the 2 squares are valid. Handles differently based on
	 * the type of board;
	 * 
	 * @param - start and end locations of movement.
	 * @return - boolean of move is indeed valid or illegal 
	 */
	public abstract boolean isMoveValid(Square from, Square to);
}
