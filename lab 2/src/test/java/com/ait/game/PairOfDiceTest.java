package com.ait.game;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairOfDiceTest {
	Die die1;
	Die die2;
	
	
	@Test
	public void rollTest() {
		die1 = new Die();
		assertEquals(die1.roll());
	}

}
