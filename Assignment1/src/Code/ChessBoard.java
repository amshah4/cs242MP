package Code;

import java.util.ArrayList;

import Code.ChessGame.Team;
import Code.pieces.ChessPiece;

public abstract class ChessBoard
{
	protected Square squares[][];//some boards will have a jagged array
	
	protected ArrayList<ChessPiece> defeatedWhitePieces;
	protected ArrayList<ChessPiece> defeatedBlackPieces;

	
	/* If a piece is at 'from', it is moved to 'to' if valid. Handles death of
	 * pieces, and checked kings.
	 * 
	 * @param - starting square and ending square of move
	 * @return - boolean for if move was valid
	 */
	public abstract boolean move(Square from, Square to);
	
	/* Checks if king is in check by checking if any of the opponent's pieces
	 * can move to kill the king.
	 * 
	 * @param - Team who's king's status is in question
	 * @return - boolean for if king is in check  
	 */
	public boolean isKingChecked(Team player)
	{
		//check if kings pos is valid for any piece of other team
		
		return false;
	}
	
	/* If opponent's king is in check, tries all possible moves. If king is
	 * still in check no matter what, player has lost.
	 * 
	 * @param - Team who's victory status is in question
	 * @return - Boolean for if player has won
	 */
	public boolean isWinner(Team player)
	{
		
		
		return false;
	}
	
	//getter
	public Square getSquare(int row, int column)
	{
		return squares[row][column];
	}
}
