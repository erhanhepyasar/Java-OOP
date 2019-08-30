package oop6polymorphism.overloading;

public class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}
