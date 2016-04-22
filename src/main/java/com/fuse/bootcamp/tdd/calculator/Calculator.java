package com.fuse.bootcamp.tdd.calculator;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Division by zero is undefined!");
		}

		return a / b;
	}

	@Override
	public boolean isEqual(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}
