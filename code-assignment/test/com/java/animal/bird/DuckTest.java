package com.java.animal.bird;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * @author User
 *
 */
class DuckTest {

	@Test
	void testSing() {
		Duck duck = new Duck();
		assertEquals("Quack quack", duck.sing());
	}

	@Test
	void testMove() {
		Duck duck = new Duck();
		assertEquals("Swim", duck.move());
	}

}
