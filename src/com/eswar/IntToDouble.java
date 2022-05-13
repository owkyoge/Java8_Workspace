package com.eswar;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class IntToDouble {

	public static void main(String[] args) {

		
		IntToDoubleFunction f = i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(9));
	}

}
