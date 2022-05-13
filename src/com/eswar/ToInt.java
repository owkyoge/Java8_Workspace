package com.eswar;

import java.util.function.IntFunction;

public class ToInt {

	public static void main(String[] args) {

		IntFunction<Integer> f = i->i*i;
		System.out.println(f.apply(5));
	}

}
