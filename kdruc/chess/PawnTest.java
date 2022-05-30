package kdruc.chess;


import kdruc.chess.pieceattributes.*;
import kdruc.chess.pieces.*;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PawnTest {

	@Test
	public void moveByOne() throws IllegalMoveException {
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

	@Test
	public void moveByTwo() throws IllegalMoveException {
		// ARRANGE
		Board board = Board.getEmptyBoard();
		Position position = Position.getPosition(0, 0);
		Piece piece = new Pawn(PieceColor.WHITE, position);
		board.addPiece(piece);
		Position target = Position.getPosition(0, 2);
		Player player = new Player(PieceColor.WHITE, board);
		// ACT
		player.makeMove(piece, target);
		// ASSERT
		assertEquals(piece, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void moveByThree() throws IllegalMoveException {
		// ARRANGE
		Board board = Board.getEmptyBoard();
		Position position = Position.getPosition(0, 0);
		Piece piece = new Pawn(PieceColor.WHITE, position);
		board.addPiece(piece);
		Position target = Position.getPosition(0, 3);
		Player player = new Player(PieceColor.WHITE, board);
		// ACT
		ThrowingRunnable throwingRunnable = () -> player.makeMove(piece, target);
		// ASSERT
		assertThrows(IllegalMoveException.class, throwingRunnable);
	}

	@Test
	public void captureBlackPawnOnTheLeft() throws IllegalMoveException {
		// ARRANGE
		Board board = Board.getEmptyBoard();
		Position position = Position.getPosition(1, 0);
		Position target = Position.getPosition(0, 1);
		Piece pieceWhite = new Pawn(PieceColor.WHITE, position);
		Piece pieceBlack = new Pawn(PieceColor.BLACK, target);
		board.addPiece(pieceWhite);
		board.addPiece(pieceBlack);
		Player player = new Player(PieceColor.WHITE, board);
		// ACT
		player.makeMove(pieceWhite, target);
		// ASSERT
		assertEquals(pieceWhite, board.getPiece(target));
		assertNull(board.getPiece(position));
	}

	@Test
	public void captureWithoutTargetThrowException() throws IllegalMoveException {
		// ARRANGE
		Board board = Board.getEmptyBoard();
		Position position = Position.getPosition(1, 0);
		Position target = Position.getPosition(0, 1);
		Piece pieceWhite = new Pawn(PieceColor.WHITE, position);
		board.addPiece(pieceWhite);
		Player player = new Player(PieceColor.WHITE, board);
		// ACT
		ThrowingRunnable throwingRunnable = () -> player.makeMove(pieceWhite, target);
		// ASSERT
		assertThrows(IllegalMoveException.class, throwingRunnable);
	}
}
