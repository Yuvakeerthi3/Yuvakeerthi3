package com.exercise.in;

public interface Fruit {
	void apple();

	default void orange() {
		System.out.println("orange");
	}

	static void grapes() {
		System.out.println("grapes");
	}
}

class B implements Fruit {
	@Override
	public void apple() {
		System.out.println("apple");
	}

	public static void main(String[] args) throws ArithmeticException {
		B in = new B();
		in.apple();
		in.orange();
		int b = 9;
		try {
			int a = b / 0;
		} catch (ArithmeticException e) {
			System.out.println("not divisible by zero");
			throw new ArithmeticException();
		} finally {
			System.out.println("it is completed");
		}

	}
}
