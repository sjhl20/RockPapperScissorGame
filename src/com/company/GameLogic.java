/**
 * 
 */
package com.company;

/**
 * @author Shree Jung Limbu
 *
 */
public class GameLogic {
	
	
	private String moveForPlayer1;
	private String moveForPlayer2;
	
	public GameLogic(String move1 , String move2){
		this.moveForPlayer1 = move1;
		this.moveForPlayer2 = move2;
	}
	

	/*
	 * Method to find out who the winner is
	 * @param player1Move Move of player 1
	 * @param player2Move Move of player 2
	 * @return Integer that determines which player wins.
	 *         0: its a tie
	 *         1: player  1 win
	 *         2: player  2 win
	 */
	public int findWinner(String player1Move , String player2Move){
		
		if(player1Move.equals(player2Move)){
			return 0;
		}else if(("Rock".equals(player1Move) && "Scissor".equals(player2Move))||
				 ("Scissor".equals(player1Move) && "Paper".equals(player2Move))||
				 ("Paper".equals(player1Move) && "Rock".equals(player2Move))){
			return 1;
		}else if(("Rock".equals(player2Move) && "Scissor".equals(player1Move))||
				 ("Scissor".equals(player2Move) && "Paper".equals(player1Move))||
				 ("Paper".equals(player2Move) && "Rock".equals(player1Move))){
			return 2;
		}
		
		return 0;
	}
	
	/*
	 * Method to customise the output statements for player versus player.
	 */
	public void playerVsPlayer(){
		System.out.println("Player 1 throws: " + moveForPlayer1.toUpperCase());
		System.out.println("Player 2 throws: " + moveForPlayer2.toUpperCase());
		
		int winnerInt = findWinner(moveForPlayer1,moveForPlayer2);
		
		switch(winnerInt){
			case 0: System.out.println("It is tie between both the players.");
					break;
			case 1: System.out.println("Player 1 has won with " + moveForPlayer1 +".");
					break;
			case 2: System.out.println("Player 2 has won with " + moveForPlayer2 +".");	
                    break;
            default: break;
		}		
	}
	
    /*
     *Method  to customise the output statements for player versus a bot.
     */
	public void playerVsBot(){	
		System.out.println("Player throws: " + moveForPlayer1.toUpperCase());
		System.out.println("Bot throws: " + moveForPlayer2.toUpperCase());
		
		int winnerInt = findWinner(moveForPlayer1,moveForPlayer2);
		
		switch(winnerInt){
			case 0: System.out.println("It is tie between both the players.");
					break;
			case 1: System.out.println("You have won against bot with " + moveForPlayer1 +".");
					break;
			case 2: System.out.println("Bot has won with " + moveForPlayer2 +".");	
                    break;
            default: break;
		}
	}

}
