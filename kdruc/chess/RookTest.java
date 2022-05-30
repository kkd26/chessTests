package kdruc.chess;

import kdruc.chess.pieceattributes.*;
import kdruc.chess.pieces.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RookTest {

	private Position position;
	private Piece piece;
	private Player player;
	private Board board;

	@Before
	public void setUpWhiteRookForMoveTestFromLeftDownCorner() throws IllegalMoveException {
		board = Board.getEmptyBoard();
		position = Position.getPosition(0, 0);
		piece = new Rook(PieceColor.WHITE, position);
		board.addPiece(piece);
		player = new Player(PieceColor.WHITE, board);
	}

	@Test
	public void moveByOneRow() throws IllegalMoveException {
		// ARRANGE
		setUpWhiteRookForMoveTestFromLeftDownCorner();
		Position target = Position.getPosition(0, 1);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void moveByTwoRows() throws IllegalMoveException {
		// ARRANGE
		setUpWhiteRookForMoveTestFromLeftDownCorner();
		Position target = Position.getPosition(0, 2);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void moveByThreeRows() throws IllegalMoveException {
		// ARRANGE
		setUpWhiteRookForMoveTestFromLeftDownCorner();
		Position target = Position.getPosition(0, 3);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void moveByOneColumn() throws IllegalMoveException {
		// ARRANGE
		setUpWhiteRookForMoveTestFromLeftDownCorner();
		Position target = Position.getPosition(1, 0);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void moveByTwoColumns() throws IllegalMoveException {
		// ARRANGE
		setUpWhiteRookForMoveTestFromLeftDownCorner();
		Position target = Position.getPosition(2, 0);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void moveByThreeColumns() throws IllegalMoveException {
		// ARRANGE
		setUpWhiteRookForMoveTestFromLeftDownCorner();
		Position target = Position.getPosition(3, 0);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}
}
