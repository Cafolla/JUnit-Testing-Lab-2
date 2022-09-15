package com.ait.game;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DieTest {
	Die die;
	PairOfDice dice;
	
	@RepeatedTest(500)
	public void testDie() {
		dice = new PairOfDice();
		die = new Die();
		die.roll();
		
		int roll1 = dice.getValue1();
		int roll2 = dice.getValue2();
		
		assertThat(roll1,allOf(greaterThanOrEqualTo(1),lessThanOrEqualTo(6)));  
	    assertThat(roll2,allOf(greaterThanOrEqualTo(1),lessThanOrEqualTo(6)));
	    die.setValue(2);
	    assertEquals(die.getValue(),2);
		}
	

}
