package com.eswar;

import java.util.function.IntUnaryOperator;

public class UnaryOperator {

	public static void main(String[] args) {

		IntUnaryOperator f = i->i*i;
		System.out.println(f.applyAsInt(6));
	}

}
