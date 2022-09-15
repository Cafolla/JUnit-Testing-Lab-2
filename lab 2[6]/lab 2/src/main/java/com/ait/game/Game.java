package com.ait.game;

import java.util.Scanner;

import com.ait.game.Player;

public class Game {
	
	private Player player1;
	private Player player2;
	private int numDiceRolls;
	static final int SCORE_TO_WIN = 20;

	public void start() {
		numDiceRolls = 0;
		// display a welcome message
		System.out.println("Welcome to the Dice Roller application");
		System.out.println();
		
		
		String player1Name;
		String player2Name;
		
		System.out.println("Please enter player one name: ");
		System.out.println("Stub uses Bob");
		
		player1Name = "Bob";
		System.out.println("Please enter player two name: ");
		System.out.println("Stub for testing uses Jack");
		
		player2Name = "Jack";
		
		player1 = new Player(player1Name);
		player2 = new Player(player2Name);
		
		
		//instead of using the original pair of dice we use the stub
		PairOfDiceStub dice = new PairOfDiceStub();
		
		System.out.println("Roll the dice? (y/n): ");
		System.out.println("Stub always says yes");
		
		String choice = "y";
		
		while (choice.equals("y")) {
			numDiceRolls++;
			System.out.println("");
			System.out.println("Round " + numDiceRolls + ": ");
			System.out.println("Rolling dice for player one ");
			dice.roll();
			System.out.println("Die 1 is " + dice.getValue1());
			System.out.println("Die 2 is " + dice.getValue2());
			player1.setTotalScore(dice.getSum());
			System.out.println("Rolling dice for player two ");
			dice.roll();
			System.out.println("Die 1 is " + dice.getValue1());
			System.out.println("Die 2 is " + dice.getValue2());
			player2.setTotalScore(dice.getSum());
			System.out.println(player1.toString());
			System.out.println(player2.toString());
			choice = "n";
			if ((player1.getTotalScore() >= SCORE_TO_WIN) && (player2.getTotalScore() >= SCORE_TO_WIN)) {
				System.out.println("DRAW");
			} else if (player1.getTotalScore() >= SCORE_TO_WIN)  {
				System.out.println(player1.getName() + " wins");
			} else if (player2.getTotalScore() >= SCORE_TO_WIN) {
				System.out.println(player2.getName() + " wins");
			} else {
				System.out.println("No winner yet");

				System.out.println("Roll the dice again? (y/n): ");
				System.out.println("Stub always y");
				choice = "y";
			}
		}
		System.out.println("Good bye!");
	}

}
