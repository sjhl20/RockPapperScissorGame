/**
 * 
 */
package com.company;

/**
 * @author Shree Jung Limbu
 *
 */
public interface RPSInterface {
	String[] validMoves = new String[] {"Rock", "Paper","Scissor"};
	
	/*
	 * Method to return one of the valid move.
	 * @return string value of the move.
	 */
	String makeMove();

}
