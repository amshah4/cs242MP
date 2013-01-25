package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.ChessBoard;
import Code.Square;
import Code.SquareBoard;
import Code.pieces.Bishop;
import Code.pieces.ChessPiece;
import Code.pieces.King;
import Code.pieces.Knight;
import Code.pieces.Pawn;
import Code.pieces.Queen;
import Code.pieces.Rook;

public class ChessPieceTest
{

	@Test
	public void testIsMoveValid()
	{
		ChessBoard board=new SquareBoard();
		
		
		//move a pawn forward
		assertTrue(board.getSquare(1, 0)
					.getChessPiece().isMoveValid(
							board.getSquare(1, 0), board.getSquare(2, 0)));
		
		//move a rook forward into pawn, or passed
		assertFalse(board.getSquare(0, 0)
				.getChessPiece().isMoveValid(
						board.getSquare(0, 0), board.getSquare(1, 0)));
		assertFalse(board.getSquare(0, 0)
				.getChessPiece().isMoveValid(
						board.getSquare(0, 0), board.getSquare(2, 0)));
		
		//try to move unit in wrong square
		assertFalse(board.getSquare(0, 0)
				.getChessPiece().isMoveValid(
						board.getSquare(1, 0), board.getSquare(2, 0)));
		
		//Doesn't include tests to make sure all pieces are moving according to correct pattern
		
		
		
		return;
	}

}
