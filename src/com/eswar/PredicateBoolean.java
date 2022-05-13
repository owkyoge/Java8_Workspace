package com.eswar;

public interface PredicateBoolean {

	public default boolean test(Integer I) {
		if (I%2==0) {
			return true;
		}
		else {
			return false;
	
		}
		
	}
}
