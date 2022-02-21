package com.company;

import java.util.Scanner;
/**
 * @author Shree Jung Limbu
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the rock, paper,scissor game.");
		System.out.println("Do you want to play against another player or bot?");
		System.out.println("Enter  1: Vs AnotherPlayer");
		System.out.println("       2: Vs Bot");
		
		Scanner scan = new Scanner(System.in);
		
		int gameModeSelection = scan.nextInt();
		
		//Player Vs Player mode
		if(gameModeSelection == 1){
			System.out.println("Enter options as [1: Rock , 2: Paper ,3:Scissor]");
			
			System.out.println("Player 1 turn:");
			int player1Move = scan.nextInt();
			System.out.println("Player 2 turn:");
			int player2Move = scan.nextInt();		
			scan.close();
			
			if(player1Move < 1 || player1Move > 3){
				System.out.println("Invalid move from Player 1!");
				
			}else if(player2Move < 1 || player2Move > 3){
				System.out.println("Invalid move from Player 2!");
			}else{
				humanPlayer player1 = new humanPlayer(player1Move);
				humanPlayer player2 = new humanPlayer(player2Move);
				
				GameLogic gameLogic = new GameLogic(player1.makeMove(),player2.makeMove());
				gameLogic.playerVsPlayer();
			}
			
		//Player Vs Bot mode			
		}else if(gameModeSelection == 2){
			System.out.println("Enter options as [1: Rock , 2: Paper ,3:Scissor]");
			System.out.println("Player turn:");
			int playerMove  = scan.nextInt();		
			scan.close();
			
			if(playerMove < 1 || playerMove> 3){
				System.out.println("Invalid move from Player!");
			}else{
				humanPlayer player  = new humanPlayer(playerMove);
				botPlayer bot       = new botPlayer();
				
				GameLogic gameLogic = new GameLogic(player.makeMove(),bot.makeMove());
				gameLogic.playerVsBot();
			}
			
		}else{
			System.out.println("Invalid game mode selection!!");
			System.out.println("Game will terminate now");
			//System.exit(1);
		}
					
	}

}
