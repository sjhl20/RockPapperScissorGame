/**
 * 
 */
package com.company;

/**
 * @author sjhl2
 *
 */
public class humanPlayer implements RPSInterface{
	
	private int playerMove;
	
	public humanPlayer(int moveInput){
		this.playerMove = moveInput;
	}
	
	/*
	 * Method to return the valid move in String
	 */
	public String makeMove(){
		
		return validMoves[playerMove -1];	
	}
	

}
