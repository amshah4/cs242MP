package Code;

import Code.pieces.ChessPiece;

public class Square
{
	//position in relation to other squares
	public final int X_POS;
	public final int Y_POS;
	private ChessPiece piece;
	
	
	//CONSTRUCTORS
	public Square(int x, int y)
	{
		X_POS=(x>0? x : 0);
		Y_POS=y;
		piece=null;
	}
	
	/* If space is empty or contains enemy piece, unit is moved here. May kill
	 * enemy piece.
	 * 
	 * @param - piece moving in
	 * @return - piece killed, or null if no kill
	 */
	public ChessPiece pieceMovedHere(ChessPiece unit)
	{
		ChessPiece temp=piece;
		piece=unit;		
		return temp;
	}
	
	/* Piece is unconditionally removed from square and returned. It is 
	 * assumed that any conditions they may cause conflict are handled
	 * before or after this call
	 * 
	 * @param - none
	 * @return - ChessPiece that was staying here, and square is now empty
	 */
	public ChessPiece pieceMovedAway()
	{
		ChessPiece temp=piece;
		piece=null;
		return temp;
	}
	
	//getter
	public ChessPiece getChessPiece()
	{
		return piece;
	}
}
