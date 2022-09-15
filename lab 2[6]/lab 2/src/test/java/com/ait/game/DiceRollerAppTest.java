package com.ait.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceRollerAppTest {
	DiceRollerApp diceRollerAppTest;

	@Test
	void draw() {
		diceRollerAppTest = new DiceRollerApp();
		PairOfDiceStub.testing = 0;
		diceRollerAppTest.main(null);
	}
	
	@Test
	void player1Wins() {
		diceRollerAppTest = new DiceRollerApp();
		PairOfDiceStub.testing = 1;
		diceRollerAppTest.main(null);
	}
	
	@Test
	void player2Wins() {
		diceRollerAppTest = new DiceRollerApp();
		PairOfDiceStub.testing = 2;
		diceRollerAppTest.main(null);
	}
	

}
