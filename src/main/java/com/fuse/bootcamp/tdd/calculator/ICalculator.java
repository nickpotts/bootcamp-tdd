package com.fuse.bootcamp.tdd.calculator;

public interface ICalculator {
	int add(int a, int b);

	int subtract(int a, int b);

	int multiply(int a, int b);

	int divide(int a, int b) throws Exception;

	boolean isEqual(int a, int b);
}
