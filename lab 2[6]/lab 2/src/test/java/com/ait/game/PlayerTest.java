package com.ait.game;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PlayerTest {


	@Test
	void testName() {
	Player playerTest = new Player("Bob");
	String name = playerTest.getName();
	assertEquals("Bob",name);
		
	}

	@Test
	void testScore() {
	Player playerTest = new Player("Bob");
	assertEquals(playerTest.getTotalScore(),0);
	playerTest.setTotalScore(15);
	assertEquals(playerTest.getTotalScore(),15);
	}
	
	@Test
	void tooString() {
	Player playerTest = new Player("Bob");
	playerTest.setTotalScore(15);
	assertEquals(playerTest.toString(),"Current score for "+"Bob" +" is "+15);
		
	}
}
