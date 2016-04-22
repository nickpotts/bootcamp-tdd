package com.fuse.bootcamp.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This will be executed before each test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This will be executed after each test");
	}

	@Test
	public void testAddition() {
        int result = calculator.add(3, 4);

        assertEquals(7, result);
	}

	@Test
	public void testSubtraction() {
		int result = calculator.subtract(10, 3);

		assertTrue(result == 7);
	}

	@Test
	public void testEqual() {
		boolean result = calculator.isEqual(20, 20);

		assertTrue(result);
	}

    // Add a test for the multiplication method

    // Add a test for the division method

    // Add a test for the thrown exception in the division method
}
