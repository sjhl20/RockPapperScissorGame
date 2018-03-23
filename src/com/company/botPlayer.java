/**
 * 
 */
package com.company;

import java.util.Random;
/**
 * @author Shree Jung Limbu
 *
 */
public class botPlayer implements RPSInterface {

	public String makeMove() {
		Random rand = new Random();
		return validMoves[rand.nextInt(validMoves.length)];
	}

}
