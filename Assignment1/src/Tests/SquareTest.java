package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Square;
import Code.pieces.Pawn;

public class SquareTest
{

	@Test
	public void testSquare()
	{
		Square x=new Square(2, 3);
		Square y=new Square(-2, 3);
		
		
		assertEquals(x.X_POS, 2);
		assertEquals(x.Y_POS, 3);
		assertEquals(y.X_POS, 0);
		
		assertEquals(x.getChessPiece(), null);
		
		
		return;
	}

	@Test
	public void testPieceMovedHere()
	{
		Square x=new Square(2, 3);
		Pawn y=new Pawn();
		
		
		assertEquals(x.pieceMovedHere(y), null);
		assertEquals(x.pieceMovedHere(new Pawn()), y);
		
		
		return;
	}

	@Test
	public void testPieceMovedAway()
	{
		Square x=new Square(2, 3);
		Pawn y=new Pawn();
		
		assertEquals(x.pieceMovedAway(), null);
		assertEquals(x.pieceMovedHere(y), null);
		assertEquals(x.pieceMovedAway(), y);
		
		
		return;
	}

}
