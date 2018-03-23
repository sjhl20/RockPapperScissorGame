package com.company;

import static org.junit.Assert.*;


public class GameLogicTest {

	@org.junit.Test
	public void testFindWinner() throws Exception {
		
		// TEST 1
		String player1MoveTest1 = "Scissor";
		String player2MoveTest1 = "Paper";
	    // expected result  1 means player 1 wins.
		int expectedResultTest1 = 1;
		GameLogic gameLogic = new GameLogic(player1MoveTest1,player2MoveTest1);
		assertEquals(expectedResultTest1,gameLogic.findWinner(player1MoveTest1, player2MoveTest1));
		
		//TEST 2
		String player1MoveTest2 = "Rock";
		String player2MoveTest2 = "Rock";
	    // expected result  0 means both player is tie
		int expectedResultTest2 = 0;
		GameLogic gameLogic2 = new GameLogic(player1MoveTest2,player2MoveTest2);
		assertEquals(expectedResultTest2,gameLogic2.findWinner(player1MoveTest2, player2MoveTest2));
				
		
	}

}
