package kdruc.chess;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BoardTest {

	@Test
	public void testBoardToString() throws IllegalMoveException {
		// ARRANGE
		Board board = new Board();
		String emptyBoard = " ╔═╤═╤═╤═╤═╤═╤═╤═╗\n" +
						"8║♜│♞│♝│♛│♚│♝│♞│♜║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"7║♟│♟│♟│♟│♟│♟│♟│♟║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"6║ │░│ │░│ │░│ │░║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"5║░│ │░│ │░│ │░│ ║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"4║ │░│ │░│ │░│ │░║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"3║░│ │░│ │░│ │░│ ║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"2║♙│♙│♙│♙│♙│♙│♙│♙║\n" +
						" ╟─┼─┼─┼─┼─┼─┼─┼─╢\n" +
						"1║♖│♘│♗│♕│♔│♗│♘│♖║\n" +
						" ╚═╧═╧═╧═╧═╧═╧═╧═╝\n" +
						"  a b c d e f g h";
		// ACT
		String boardToString = board.toString();
		// ASSERT
		assertEquals(emptyBoard, boardToString);
	}

}