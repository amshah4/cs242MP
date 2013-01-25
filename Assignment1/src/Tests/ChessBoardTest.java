package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.ChessBoard;
import Code.ChessGame.Team;
import Code.SquareBoard;

import Code.ChessGame;

public class ChessBoardTest
{

	@Test
	public void testMove()
	{
		ChessBoard b=new SquareBoard();
		
		
		assertFalse(b.move(b.getSquare(0, 0), b.getSquare(0, 1)));
		assertFalse(b.move(b.getSquare(1, 0), b.getSquare(4, 0)));
		assertFalse(b.move(b.getSquare(0, 0), b.getSquare(0, 1)));
		//not all cases, test when king is in  check
		
		
		return;		
	}

	@Test
	public void testIsKingChecked()
	{

		ChessBoard b=new SquareBoard();
		
		
		assertFalse(b.isKingChecked(Team.WHITE));
		assertFalse(b.isKingChecked(Team.BLACK));
		//doesn't have test yet for when king IS in check


		return;
	}

	@Test
	public void testIsWinner()
	{
		ChessBoard b=new SquareBoard();
		
		
		assertFalse(b.isWinner(Team.WHITE));
		assertFalse(b.isWinner(Team.BLACK));
		//doesn't have test yet for when you DID win
		
		
		return;
	}

}
