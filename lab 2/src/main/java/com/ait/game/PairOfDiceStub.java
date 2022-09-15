package com.ait.game;

public class PairOfDiceStub {
	int counter = 0;
	int value1;
	int value2;
	Die die1;
	Die die2;
	public static int testing = 0;

	public PairOfDiceStub() {
		die1 = new Die();
		die2 = new Die();

	}

	public void roll() {

		// testing for draw
		if (testing == 0) {

			if (counter == 0) {
				die1.setValue(6);// player1
				die2.setValue(6);
			} else if (counter == 1) {	// player2
				die1.setValue(6);		// player1
				die2.setValue(6);
			
			} else if (counter == 2) {
				die1.setValue(4);
				die2.setValue(4);
			} else if (counter == 3) {
				die1.setValue(2);
				die2.setValue(6);
			} 
			counter++;

		}
		
		
		// testing where player one wins
		if (testing == 1) {

			if (counter == 0) {
				die1.setValue(6);// player1
				die2.setValue(6);
			} else if (counter == 1) {// player2
				die1.setValue(6);// player1
				die2.setValue(6);
			} else if (counter == 2) {
				die1.setValue(6);
				die2.setValue(6);
			} else if (counter == 3) {
				die1.setValue(4);
				die2.setValue(1);
			} 
			counter++;

		}

		// testing where player two wins
		if (testing == 2) {

			if (counter == 0) {
				die1.setValue(6);// player1
				die2.setValue(6);
			} else if (counter == 1) {// player2
				die1.setValue(6);// player1
				die2.setValue(6);
			} else if (counter == 2) {
				die1.setValue(2);
				die2.setValue(1);
			} else if (counter == 3) {
				die1.setValue(6);
				die2.setValue(4);
			} 
			counter++;

		}

	}

	// get value of die1
	public int getValue1() {
		return die1.getValue();
	}

	// get value of die2
	public int getValue2() {
		return die2.getValue();
	}

	public int getSum() {
		return die1.getValue()+ die2.getValue();
	}	
		
	

}
