package com.fuse.bootcamp.tdd.calculator;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_EXCLUSIONPeer;
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

	@Test
	public void testMultiplication() {
		int result = calculator.multiply(3,4);

		assertEquals(12, result);
	}

	@Test
	public void testDivison() throws Exception {
		int result = calculator.divide(20,4);

		assertEquals(5, result);
	}


	@Test(expected = Exception.class)
	public void testDivisionByZero() throws Exception {
		int result = calculator.divide(10,0);
	}

	@Test
	public void testDivisionExceptionMessage() throws Exception {
		try {
			int result = calculator.divide(11, 0);
		} catch (Exception e) {
			assertEquals("Can not divide by zero.", e.getMessage());
		}
	}
    // Add a test for the multiplication method

    // Add a test for the division method

    // Add a test for the thrown exception in the division method
}
