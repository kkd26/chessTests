package kdruc.chess;

import kdruc.chess.pieceattributes.PieceColor;
import kdruc.chess.pieceattributes.Position;
import kdruc.chess.pieces.Pawn;
import kdruc.chess.pieces.Piece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PawnMoveTest {

	@Test
	public void movePawnWhiteByOneRow() throws IllegalMoveException {

		Position position = Position.getPosition(1, 1);
		Piece pawn = new Pawn(PieceColor.WHITE, position);
		Board board = Board.getEmptyBoard();
		board.addPiece(pawn);
		Player p = new Player(PieceColor.WHITE, board);

		Position target = Position.getPosition(1, 2);
		p.makeMove(pawn, target);

		Piece oldPositionPiece = board.getPiece(position);
		Piece targetPiece = board.getPiece(target);

		assertEquals(targetPiece, pawn);
		assertNull(oldPositionPiece);

	}
}
